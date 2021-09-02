// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShoppingOrderService.proto

package shopping.order.proto;

/**
 * Protobuf type {@code shoppingorder.OrderRequest}
 */
public  final class OrderRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:shoppingorder.OrderRequest)
    OrderRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderRequest.newBuilder() to construct.
  private OrderRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderRequest() {
    cartId_ = "";
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrderRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            cartId_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              items_ = new java.util.ArrayList<shopping.order.proto.Item>();
              mutable_bitField0_ |= 0x00000001;
            }
            items_.add(
                input.readMessage(shopping.order.proto.Item.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        items_ = java.util.Collections.unmodifiableList(items_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return shopping.order.proto.ShoppingOrderServiceOuterClass.internal_static_shoppingorder_OrderRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return shopping.order.proto.ShoppingOrderServiceOuterClass.internal_static_shoppingorder_OrderRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            shopping.order.proto.OrderRequest.class, shopping.order.proto.OrderRequest.Builder.class);
  }

  public static final int CARTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object cartId_;
  /**
   * <code>string cartId = 1;</code>
   * @return The cartId.
   */
  public java.lang.String getCartId() {
    java.lang.Object ref = cartId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cartId_ = s;
      return s;
    }
  }
  /**
   * <code>string cartId = 1;</code>
   * @return The bytes for cartId.
   */
  public com.google.protobuf.ByteString
      getCartIdBytes() {
    java.lang.Object ref = cartId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cartId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEMS_FIELD_NUMBER = 2;
  private java.util.List<shopping.order.proto.Item> items_;
  /**
   * <code>repeated .shoppingorder.Item items = 2;</code>
   */
  public java.util.List<shopping.order.proto.Item> getItemsList() {
    return items_;
  }
  /**
   * <code>repeated .shoppingorder.Item items = 2;</code>
   */
  public java.util.List<? extends shopping.order.proto.ItemOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <code>repeated .shoppingorder.Item items = 2;</code>
   */
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <code>repeated .shoppingorder.Item items = 2;</code>
   */
  public shopping.order.proto.Item getItems(int index) {
    return items_.get(index);
  }
  /**
   * <code>repeated .shoppingorder.Item items = 2;</code>
   */
  public shopping.order.proto.ItemOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getCartIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cartId_);
    }
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(2, items_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCartIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cartId_);
    }
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, items_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof shopping.order.proto.OrderRequest)) {
      return super.equals(obj);
    }
    shopping.order.proto.OrderRequest other = (shopping.order.proto.OrderRequest) obj;

    if (!getCartId()
        .equals(other.getCartId())) return false;
    if (!getItemsList()
        .equals(other.getItemsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CARTID_FIELD_NUMBER;
    hash = (53 * hash) + getCartId().hashCode();
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static shopping.order.proto.OrderRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static shopping.order.proto.OrderRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static shopping.order.proto.OrderRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static shopping.order.proto.OrderRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static shopping.order.proto.OrderRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static shopping.order.proto.OrderRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static shopping.order.proto.OrderRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static shopping.order.proto.OrderRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static shopping.order.proto.OrderRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static shopping.order.proto.OrderRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static shopping.order.proto.OrderRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static shopping.order.proto.OrderRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(shopping.order.proto.OrderRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code shoppingorder.OrderRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:shoppingorder.OrderRequest)
      shopping.order.proto.OrderRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return shopping.order.proto.ShoppingOrderServiceOuterClass.internal_static_shoppingorder_OrderRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return shopping.order.proto.ShoppingOrderServiceOuterClass.internal_static_shoppingorder_OrderRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              shopping.order.proto.OrderRequest.class, shopping.order.proto.OrderRequest.Builder.class);
    }

    // Construct using shopping.order.proto.OrderRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getItemsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      cartId_ = "";

      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return shopping.order.proto.ShoppingOrderServiceOuterClass.internal_static_shoppingorder_OrderRequest_descriptor;
    }

    @java.lang.Override
    public shopping.order.proto.OrderRequest getDefaultInstanceForType() {
      return shopping.order.proto.OrderRequest.getDefaultInstance();
    }

    @java.lang.Override
    public shopping.order.proto.OrderRequest build() {
      shopping.order.proto.OrderRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public shopping.order.proto.OrderRequest buildPartial() {
      shopping.order.proto.OrderRequest result = new shopping.order.proto.OrderRequest(this);
      int from_bitField0_ = bitField0_;
      result.cartId_ = cartId_;
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof shopping.order.proto.OrderRequest) {
        return mergeFrom((shopping.order.proto.OrderRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(shopping.order.proto.OrderRequest other) {
      if (other == shopping.order.proto.OrderRequest.getDefaultInstance()) return this;
      if (!other.getCartId().isEmpty()) {
        cartId_ = other.cartId_;
        onChanged();
      }
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      shopping.order.proto.OrderRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (shopping.order.proto.OrderRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object cartId_ = "";
    /**
     * <code>string cartId = 1;</code>
     * @return The cartId.
     */
    public java.lang.String getCartId() {
      java.lang.Object ref = cartId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cartId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cartId = 1;</code>
     * @return The bytes for cartId.
     */
    public com.google.protobuf.ByteString
        getCartIdBytes() {
      java.lang.Object ref = cartId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cartId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cartId = 1;</code>
     * @param value The cartId to set.
     * @return This builder for chaining.
     */
    public Builder setCartId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cartId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string cartId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCartId() {
      
      cartId_ = getDefaultInstance().getCartId();
      onChanged();
      return this;
    }
    /**
     * <code>string cartId = 1;</code>
     * @param value The bytes for cartId to set.
     * @return This builder for chaining.
     */
    public Builder setCartIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cartId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<shopping.order.proto.Item> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        items_ = new java.util.ArrayList<shopping.order.proto.Item>(items_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        shopping.order.proto.Item, shopping.order.proto.Item.Builder, shopping.order.proto.ItemOrBuilder> itemsBuilder_;

    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public java.util.List<shopping.order.proto.Item> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public shopping.order.proto.Item getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public Builder setItems(
        int index, shopping.order.proto.Item value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public Builder setItems(
        int index, shopping.order.proto.Item.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public Builder addItems(shopping.order.proto.Item value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public Builder addItems(
        int index, shopping.order.proto.Item value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public Builder addItems(
        shopping.order.proto.Item.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public Builder addItems(
        int index, shopping.order.proto.Item.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends shopping.order.proto.Item> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public shopping.order.proto.Item.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public shopping.order.proto.ItemOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public java.util.List<? extends shopping.order.proto.ItemOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public shopping.order.proto.Item.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          shopping.order.proto.Item.getDefaultInstance());
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public shopping.order.proto.Item.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, shopping.order.proto.Item.getDefaultInstance());
    }
    /**
     * <code>repeated .shoppingorder.Item items = 2;</code>
     */
    public java.util.List<shopping.order.proto.Item.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        shopping.order.proto.Item, shopping.order.proto.Item.Builder, shopping.order.proto.ItemOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            shopping.order.proto.Item, shopping.order.proto.Item.Builder, shopping.order.proto.ItemOrBuilder>(
                items_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:shoppingorder.OrderRequest)
  }

  // @@protoc_insertion_point(class_scope:shoppingorder.OrderRequest)
  private static final shopping.order.proto.OrderRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new shopping.order.proto.OrderRequest();
  }

  public static shopping.order.proto.OrderRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderRequest>
      PARSER = new com.google.protobuf.AbstractParser<OrderRequest>() {
    @java.lang.Override
    public OrderRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public shopping.order.proto.OrderRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

