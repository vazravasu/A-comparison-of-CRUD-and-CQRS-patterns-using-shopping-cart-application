// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShoppingCartService.proto

package shopping.cart.proto;

public interface CartOrBuilder extends
    // @@protoc_insertion_point(interface_extends:shoppingcart.Cart)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .shoppingcart.Item items = 1;</code>
   */
  java.util.List<shopping.cart.proto.Item> 
      getItemsList();
  /**
   * <code>repeated .shoppingcart.Item items = 1;</code>
   */
  shopping.cart.proto.Item getItems(int index);
  /**
   * <code>repeated .shoppingcart.Item items = 1;</code>
   */
  int getItemsCount();
  /**
   * <code>repeated .shoppingcart.Item items = 1;</code>
   */
  java.util.List<? extends shopping.cart.proto.ItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <code>repeated .shoppingcart.Item items = 1;</code>
   */
  shopping.cart.proto.ItemOrBuilder getItemsOrBuilder(
      int index);

  /**
   * <code>bool checkedOut = 2;</code>
   * @return The checkedOut.
   */
  boolean getCheckedOut();
}
