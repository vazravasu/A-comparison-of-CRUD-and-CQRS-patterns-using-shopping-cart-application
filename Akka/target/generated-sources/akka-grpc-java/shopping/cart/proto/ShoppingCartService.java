
// Generated by Akka gRPC. DO NOT EDIT.
package shopping.cart.proto;

import akka.grpc.ProtobufSerializer;
import akka.grpc.javadsl.GoogleProtobufSerializer;


public interface ShoppingCartService {
  
  
  java.util.concurrent.CompletionStage<shopping.cart.proto.Cart> addItem(shopping.cart.proto.AddItemRequest in);
  
  
  java.util.concurrent.CompletionStage<shopping.cart.proto.Cart> updateItem(shopping.cart.proto.UpdateItemRequest in);
  
  
  java.util.concurrent.CompletionStage<shopping.cart.proto.Cart> checkout(shopping.cart.proto.CheckoutRequest in);
  
  
  java.util.concurrent.CompletionStage<shopping.cart.proto.Cart> getCart(shopping.cart.proto.GetCartRequest in);
  
  
  java.util.concurrent.CompletionStage<shopping.cart.proto.GetItemPopularityResponse> getItemPopularity(shopping.cart.proto.GetItemPopularityRequest in);
  
  
  java.util.concurrent.CompletionStage<shopping.cart.proto.EmptyMsg> failShoppingCartService(shopping.cart.proto.EmptyMsg in);
  
  
  java.util.concurrent.CompletionStage<shopping.cart.proto.Cart> failShoppingCart(shopping.cart.proto.FailCartMsg in);
  

  static String name = "shoppingcart.ShoppingCartService";
  static akka.grpc.ServiceDescription description = new akka.grpc.internal.ServiceDescriptionImpl(name, ShoppingCartServiceOuterClass.getDescriptor());

  public static class Serializers {
    
      public static ProtobufSerializer<shopping.cart.proto.AddItemRequest> AddItemRequestSerializer = new GoogleProtobufSerializer<>(shopping.cart.proto.AddItemRequest.class);
    
      public static ProtobufSerializer<shopping.cart.proto.UpdateItemRequest> UpdateItemRequestSerializer = new GoogleProtobufSerializer<>(shopping.cart.proto.UpdateItemRequest.class);
    
      public static ProtobufSerializer<shopping.cart.proto.CheckoutRequest> CheckoutRequestSerializer = new GoogleProtobufSerializer<>(shopping.cart.proto.CheckoutRequest.class);
    
      public static ProtobufSerializer<shopping.cart.proto.GetCartRequest> GetCartRequestSerializer = new GoogleProtobufSerializer<>(shopping.cart.proto.GetCartRequest.class);
    
      public static ProtobufSerializer<shopping.cart.proto.GetItemPopularityRequest> GetItemPopularityRequestSerializer = new GoogleProtobufSerializer<>(shopping.cart.proto.GetItemPopularityRequest.class);
    
      public static ProtobufSerializer<shopping.cart.proto.EmptyMsg> EmptyMsgSerializer = new GoogleProtobufSerializer<>(shopping.cart.proto.EmptyMsg.class);
    
      public static ProtobufSerializer<shopping.cart.proto.FailCartMsg> FailCartMsgSerializer = new GoogleProtobufSerializer<>(shopping.cart.proto.FailCartMsg.class);
    
      public static ProtobufSerializer<shopping.cart.proto.Cart> CartSerializer = new GoogleProtobufSerializer<>(shopping.cart.proto.Cart.class);
    
      public static ProtobufSerializer<shopping.cart.proto.GetItemPopularityResponse> GetItemPopularityResponseSerializer = new GoogleProtobufSerializer<>(shopping.cart.proto.GetItemPopularityResponse.class);
    
  }
}
