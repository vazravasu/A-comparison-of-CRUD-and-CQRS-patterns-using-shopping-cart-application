// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShoppingCartEvents.proto

package shopping.cart.proto;

public final class ShoppingCartEvents {
  private ShoppingCartEvents() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_shoppingcart_ItemAdded_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_shoppingcart_ItemAdded_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_shoppingcart_ItemQuantityAdjusted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_shoppingcart_ItemQuantityAdjusted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_shoppingcart_ItemRemoved_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_shoppingcart_ItemRemoved_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_shoppingcart_CheckedOut_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_shoppingcart_CheckedOut_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ShoppingCartEvents.proto\022\014shoppingcart" +
      "\"=\n\tItemAdded\022\016\n\006cartId\030\001 \001(\t\022\016\n\006itemId\030" +
      "\002 \001(\t\022\020\n\010quantity\030\003 \001(\005\"H\n\024ItemQuantityA" +
      "djusted\022\016\n\006cartId\030\001 \001(\t\022\016\n\006itemId\030\002 \001(\t\022" +
      "\020\n\010quantity\030\003 \001(\005\"-\n\013ItemRemoved\022\016\n\006cart" +
      "Id\030\001 \001(\t\022\016\n\006itemId\030\002 \001(\t\"\034\n\nCheckedOut\022\016" +
      "\n\006cartId\030\001 \001(\tB\027\n\023shopping.cart.protoP\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_shoppingcart_ItemAdded_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_shoppingcart_ItemAdded_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_shoppingcart_ItemAdded_descriptor,
        new java.lang.String[] { "CartId", "ItemId", "Quantity", });
    internal_static_shoppingcart_ItemQuantityAdjusted_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_shoppingcart_ItemQuantityAdjusted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_shoppingcart_ItemQuantityAdjusted_descriptor,
        new java.lang.String[] { "CartId", "ItemId", "Quantity", });
    internal_static_shoppingcart_ItemRemoved_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_shoppingcart_ItemRemoved_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_shoppingcart_ItemRemoved_descriptor,
        new java.lang.String[] { "CartId", "ItemId", });
    internal_static_shoppingcart_CheckedOut_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_shoppingcart_CheckedOut_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_shoppingcart_CheckedOut_descriptor,
        new java.lang.String[] { "CartId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
