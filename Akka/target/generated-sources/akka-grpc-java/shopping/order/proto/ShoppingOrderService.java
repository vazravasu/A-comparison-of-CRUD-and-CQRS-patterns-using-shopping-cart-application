
// Generated by Akka gRPC. DO NOT EDIT.
package shopping.order.proto;

import akka.grpc.ProtobufSerializer;
import akka.grpc.javadsl.GoogleProtobufSerializer;


public interface ShoppingOrderService {
  
  
  java.util.concurrent.CompletionStage<shopping.order.proto.OrderResponse> order(shopping.order.proto.OrderRequest in);
  

  static String name = "shoppingorder.ShoppingOrderService";
  static akka.grpc.ServiceDescription description = new akka.grpc.internal.ServiceDescriptionImpl(name, ShoppingOrderServiceOuterClass.getDescriptor());

  public static class Serializers {
    
      public static ProtobufSerializer<shopping.order.proto.OrderRequest> OrderRequestSerializer = new GoogleProtobufSerializer<>(shopping.order.proto.OrderRequest.class);
    
      public static ProtobufSerializer<shopping.order.proto.OrderResponse> OrderResponseSerializer = new GoogleProtobufSerializer<>(shopping.order.proto.OrderResponse.class);
    
  }
}
