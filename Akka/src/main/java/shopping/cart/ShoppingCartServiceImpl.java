package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.actor.typed.DispatcherSelector;
import akka.cluster.sharding.typed.javadsl.ClusterSharding;
import akka.cluster.sharding.typed.javadsl.EntityRef;
import akka.grpc.GrpcServiceException;
import io.grpc.Status;
import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.proto.*;
import shopping.cart.repository.ItemPopularityRepository;

public final class ShoppingCartServiceImpl implements ShoppingCartService {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  private final Duration timeout;
  private final ClusterSharding sharding;

  
  private final ItemPopularityRepository repository;
  private final Executor blockingJdbcExecutor;

  public ShoppingCartServiceImpl(
      ActorSystem<?> system, ItemPopularityRepository repository) {

    DispatcherSelector dispatcherSelector =
        DispatcherSelector.fromConfig("akka.projection.jdbc.blocking-jdbc-dispatcher");
    this.blockingJdbcExecutor = system.dispatchers().lookup(dispatcherSelector); 

    this.repository = repository;
    timeout = system.settings().config().getDuration("shopping-cart-service.ask-timeout");
    sharding = ClusterSharding.get(system);

    logger.info("====================== Shopping Cart Service has started ====================");
  }

  

  @Override
  public CompletionStage<Cart> addItem(AddItemRequest in) {
    logger.info("addItem {} to cart {}", in.getItemId(), in.getCartId());
    if(in.getCartId() == "fail") {
      logger.info("add Item Failed!!!!!!!!!!!!!!!!!!!!!!!");
      int i = 100/0;
    }
    EntityRef<ShoppingCart.Command> entityRef =
        sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
    CompletionStage<ShoppingCart.Summary> reply =
        entityRef.askWithStatus(
            replyTo -> new ShoppingCart.AddItem(in.getItemId(), in.getQuantity(), replyTo),
            timeout);
    CompletionStage<Cart> cart = reply.thenApply(ShoppingCartServiceImpl::toProtoCart);
    return convertError(cart);
  }

  @Override
  public CompletionStage<Cart> updateItem(UpdateItemRequest in) {
    logger.info("getCart {}", in.getCartId());
    if(in.getCartId() == "fail") {
      logger.info("update Item Failed!!!!!!!!!!!!!!!!!!!!!!!");
      int i = 100/0;
    }
    EntityRef<ShoppingCart.Command> entityRef =
        sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
    final CompletionStage<ShoppingCart.Summary> reply;

    if (in.getQuantity() == 0) {
      reply =
          entityRef.askWithStatus(
              replyTo -> new ShoppingCart.RemoveItem(in.getItemId(), replyTo), timeout);
    } else {
      reply =
          entityRef.askWithStatus(
              replyTo ->
                  new ShoppingCart.AdjustItemQuantity(in.getItemId(), in.getQuantity(), replyTo),
              timeout);
    }
    CompletionStage<Cart> cart = reply.thenApply(ShoppingCartServiceImpl::toProtoCart);
    return convertError(cart);
  }

  
  @Override
  public CompletionStage<Cart> checkout(CheckoutRequest in) {
    logger.info("checkout {}", in.getCartId());
    if(in.getCartId() == "fail") {
      logger.info("checkout Failed!!!!!!!!!!!!!!!!!!!!!!!");
      int i = 100/0;
    }
    EntityRef<ShoppingCart.Command> entityRef =
        sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
    CompletionStage<ShoppingCart.Summary> reply =
        entityRef.askWithStatus(replyTo -> new ShoppingCart.Checkout(replyTo), timeout);
    CompletionStage<Cart> cart = reply.thenApply(ShoppingCartServiceImpl::toProtoCart);
    return convertError(cart);
  }

  @Override
  public CompletionStage<Cart> getCart(GetCartRequest in) {
    logger.info("getCart {}", in.getCartId());
    if(in.getCartId() == "fail") {
      logger.info("get cart Failed!!!!!!!!!!!!!!!!!!!!!!!");
      int i = 100/0;
    }
    EntityRef<ShoppingCart.Command> entityRef =
        sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
    CompletionStage<ShoppingCart.Summary> reply =
        entityRef.ask(replyTo -> new ShoppingCart.Get(replyTo), timeout);
    CompletionStage<Cart> protoCart =
        reply.thenApply(
            cart -> {
              if (cart.items.isEmpty())
                throw new GrpcServiceException(
                    Status.NOT_FOUND.withDescription("Cart " + in.getCartId() + " not found"));
              else return toProtoCart(cart);
            });
    return convertError(protoCart);
  }

  @Override
  public CompletionStage<Cart> failShoppingCart(FailCartMsg in) {
    logger.info("getCart {}", in.getCartId());
    EntityRef<ShoppingCart.Command> entityRef =
        sharding.entityRefFor(ShoppingCart.ENTITY_KEY, in.getCartId());
    CompletionStage<ShoppingCart.Summary> reply =
        entityRef.ask(replyTo -> new ShoppingCart.FailCart(replyTo), timeout);
    CompletionStage<Cart> protoCart =
        reply.thenApply(
            cart -> {
              if (cart.items.isEmpty())
                throw new GrpcServiceException(
                    Status.NOT_FOUND.withDescription("Cart " + in.getCartId() + " not found"));
              else return toProtoCart(cart);
            });
    return convertError(protoCart);
  }


  
  @Override
  public CompletionStage<GetItemPopularityResponse> getItemPopularity(GetItemPopularityRequest in) {
    if(in.getItemId() == "fail") {
      logger.info("get item Popularity Failed!!!!!!!!!!!!!!!!!!!!!!!");
      int i = 100/0;
    }
    CompletionStage<Optional<ItemPopularity>> itemPopularity =
        CompletableFuture.supplyAsync(
            () -> repository.findById(in.getItemId()), blockingJdbcExecutor); 

    return itemPopularity.thenApply(
        popularity -> {
          long count = popularity.map(ItemPopularity::getCount).orElse(0L);
          return GetItemPopularityResponse.newBuilder().setPopularityCount(count).build();
        });
  }
  
  @Override
  public CompletionStage<EmptyMsg> failShoppingCartService (EmptyMsg in) {

    int x = 100/0;

    return null;
  }


  
  private static Cart toProtoCart(ShoppingCart.Summary cart) {
    List<Item> protoItems =
        cart.items.entrySet().stream()
            .map(
                entry ->
                    Item.newBuilder()
                        .setItemId(entry.getKey())
                        .setQuantity(entry.getValue())
                        .build())
            .collect(Collectors.toList());

    return Cart.newBuilder().setCheckedOut(cart.checkedOut).addAllItems(protoItems).build();
  }
  

  private static <T> CompletionStage<T> convertError(CompletionStage<T> response) {
    return response.exceptionally(
        ex -> {
          if (ex instanceof TimeoutException) {
            throw new GrpcServiceException(
                Status.UNAVAILABLE.withDescription("Operation timed out"));
          } else {
            throw new GrpcServiceException(
                Status.INVALID_ARGUMENT.withDescription(ex.getMessage()));
          }
        });
  }
}
