// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShoppingCartService.proto

package shopping.cart.proto;

public interface UpdateItemRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:shoppingcart.UpdateItemRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string cartId = 1;</code>
   * @return The cartId.
   */
  java.lang.String getCartId();
  /**
   * <code>string cartId = 1;</code>
   * @return The bytes for cartId.
   */
  com.google.protobuf.ByteString
      getCartIdBytes();

  /**
   * <code>string itemId = 2;</code>
   * @return The itemId.
   */
  java.lang.String getItemId();
  /**
   * <code>string itemId = 2;</code>
   * @return The bytes for itemId.
   */
  com.google.protobuf.ByteString
      getItemIdBytes();

  /**
   * <code>int32 quantity = 3;</code>
   * @return The quantity.
   */
  int getQuantity();
}
