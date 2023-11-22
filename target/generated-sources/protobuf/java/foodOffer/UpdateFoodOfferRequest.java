// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoodOfferService.proto

package foodOffer;

/**
 * Protobuf type {@code foodOffer.UpdateFoodOfferRequest}
 */
public  final class UpdateFoodOfferRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:foodOffer.UpdateFoodOfferRequest)
    UpdateFoodOfferRequestOrBuilder {
  // Use UpdateFoodOfferRequest.newBuilder() to construct.
  private UpdateFoodOfferRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateFoodOfferRequest() {
    foodSellerId_ = 0;
    title_ = "";
    description_ = "";
    price_ = 0D;
    startPickUpTime_ = "";
    endPickUpTime_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpdateFoodOfferRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            foodSellerId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            title_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 33: {

            price_ = input.readDouble();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            startPickUpTime_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            endPickUpTime_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return foodOffer.FoodOfferServiceOuterClass.internal_static_foodOffer_UpdateFoodOfferRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return foodOffer.FoodOfferServiceOuterClass.internal_static_foodOffer_UpdateFoodOfferRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            foodOffer.UpdateFoodOfferRequest.class, foodOffer.UpdateFoodOfferRequest.Builder.class);
  }

  public static final int FOODSELLERID_FIELD_NUMBER = 1;
  private int foodSellerId_;
  /**
   * <code>int32 foodSellerId = 1;</code>
   */
  public int getFoodSellerId() {
    return foodSellerId_;
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 2;</code>
   */
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 3;</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_FIELD_NUMBER = 4;
  private double price_;
  /**
   * <code>double price = 4;</code>
   */
  public double getPrice() {
    return price_;
  }

  public static final int STARTPICKUPTIME_FIELD_NUMBER = 5;
  private volatile java.lang.Object startPickUpTime_;
  /**
   * <code>string startPickUpTime = 5;</code>
   */
  public java.lang.String getStartPickUpTime() {
    java.lang.Object ref = startPickUpTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startPickUpTime_ = s;
      return s;
    }
  }
  /**
   * <code>string startPickUpTime = 5;</code>
   */
  public com.google.protobuf.ByteString
      getStartPickUpTimeBytes() {
    java.lang.Object ref = startPickUpTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startPickUpTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDPICKUPTIME_FIELD_NUMBER = 6;
  private volatile java.lang.Object endPickUpTime_;
  /**
   * <code>string endPickUpTime = 6;</code>
   */
  public java.lang.String getEndPickUpTime() {
    java.lang.Object ref = endPickUpTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endPickUpTime_ = s;
      return s;
    }
  }
  /**
   * <code>string endPickUpTime = 6;</code>
   */
  public com.google.protobuf.ByteString
      getEndPickUpTimeBytes() {
    java.lang.Object ref = endPickUpTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endPickUpTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (foodSellerId_ != 0) {
      output.writeInt32(1, foodSellerId_);
    }
    if (!getTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    if (price_ != 0D) {
      output.writeDouble(4, price_);
    }
    if (!getStartPickUpTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, startPickUpTime_);
    }
    if (!getEndPickUpTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, endPickUpTime_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (foodSellerId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, foodSellerId_);
    }
    if (!getTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    if (price_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, price_);
    }
    if (!getStartPickUpTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, startPickUpTime_);
    }
    if (!getEndPickUpTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, endPickUpTime_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof foodOffer.UpdateFoodOfferRequest)) {
      return super.equals(obj);
    }
    foodOffer.UpdateFoodOfferRequest other = (foodOffer.UpdateFoodOfferRequest) obj;

    boolean result = true;
    result = result && (getFoodSellerId()
        == other.getFoodSellerId());
    result = result && getTitle()
        .equals(other.getTitle());
    result = result && getDescription()
        .equals(other.getDescription());
    result = result && (
        java.lang.Double.doubleToLongBits(getPrice())
        == java.lang.Double.doubleToLongBits(
            other.getPrice()));
    result = result && getStartPickUpTime()
        .equals(other.getStartPickUpTime());
    result = result && getEndPickUpTime()
        .equals(other.getEndPickUpTime());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FOODSELLERID_FIELD_NUMBER;
    hash = (53 * hash) + getFoodSellerId();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPrice()));
    hash = (37 * hash) + STARTPICKUPTIME_FIELD_NUMBER;
    hash = (53 * hash) + getStartPickUpTime().hashCode();
    hash = (37 * hash) + ENDPICKUPTIME_FIELD_NUMBER;
    hash = (53 * hash) + getEndPickUpTime().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static foodOffer.UpdateFoodOfferRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static foodOffer.UpdateFoodOfferRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static foodOffer.UpdateFoodOfferRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static foodOffer.UpdateFoodOfferRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static foodOffer.UpdateFoodOfferRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static foodOffer.UpdateFoodOfferRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static foodOffer.UpdateFoodOfferRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static foodOffer.UpdateFoodOfferRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static foodOffer.UpdateFoodOfferRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static foodOffer.UpdateFoodOfferRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static foodOffer.UpdateFoodOfferRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static foodOffer.UpdateFoodOfferRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(foodOffer.UpdateFoodOfferRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code foodOffer.UpdateFoodOfferRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:foodOffer.UpdateFoodOfferRequest)
      foodOffer.UpdateFoodOfferRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return foodOffer.FoodOfferServiceOuterClass.internal_static_foodOffer_UpdateFoodOfferRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return foodOffer.FoodOfferServiceOuterClass.internal_static_foodOffer_UpdateFoodOfferRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              foodOffer.UpdateFoodOfferRequest.class, foodOffer.UpdateFoodOfferRequest.Builder.class);
    }

    // Construct using foodOffer.UpdateFoodOfferRequest.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      foodSellerId_ = 0;

      title_ = "";

      description_ = "";

      price_ = 0D;

      startPickUpTime_ = "";

      endPickUpTime_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return foodOffer.FoodOfferServiceOuterClass.internal_static_foodOffer_UpdateFoodOfferRequest_descriptor;
    }

    public foodOffer.UpdateFoodOfferRequest getDefaultInstanceForType() {
      return foodOffer.UpdateFoodOfferRequest.getDefaultInstance();
    }

    public foodOffer.UpdateFoodOfferRequest build() {
      foodOffer.UpdateFoodOfferRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public foodOffer.UpdateFoodOfferRequest buildPartial() {
      foodOffer.UpdateFoodOfferRequest result = new foodOffer.UpdateFoodOfferRequest(this);
      result.foodSellerId_ = foodSellerId_;
      result.title_ = title_;
      result.description_ = description_;
      result.price_ = price_;
      result.startPickUpTime_ = startPickUpTime_;
      result.endPickUpTime_ = endPickUpTime_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof foodOffer.UpdateFoodOfferRequest) {
        return mergeFrom((foodOffer.UpdateFoodOfferRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(foodOffer.UpdateFoodOfferRequest other) {
      if (other == foodOffer.UpdateFoodOfferRequest.getDefaultInstance()) return this;
      if (other.getFoodSellerId() != 0) {
        setFoodSellerId(other.getFoodSellerId());
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.getPrice() != 0D) {
        setPrice(other.getPrice());
      }
      if (!other.getStartPickUpTime().isEmpty()) {
        startPickUpTime_ = other.startPickUpTime_;
        onChanged();
      }
      if (!other.getEndPickUpTime().isEmpty()) {
        endPickUpTime_ = other.endPickUpTime_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      foodOffer.UpdateFoodOfferRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (foodOffer.UpdateFoodOfferRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int foodSellerId_ ;
    /**
     * <code>int32 foodSellerId = 1;</code>
     */
    public int getFoodSellerId() {
      return foodSellerId_;
    }
    /**
     * <code>int32 foodSellerId = 1;</code>
     */
    public Builder setFoodSellerId(int value) {
      
      foodSellerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 foodSellerId = 1;</code>
     */
    public Builder clearFoodSellerId() {
      
      foodSellerId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 2;</code>
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 3;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 3;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private double price_ ;
    /**
     * <code>double price = 4;</code>
     */
    public double getPrice() {
      return price_;
    }
    /**
     * <code>double price = 4;</code>
     */
    public Builder setPrice(double value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double price = 4;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object startPickUpTime_ = "";
    /**
     * <code>string startPickUpTime = 5;</code>
     */
    public java.lang.String getStartPickUpTime() {
      java.lang.Object ref = startPickUpTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startPickUpTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string startPickUpTime = 5;</code>
     */
    public com.google.protobuf.ByteString
        getStartPickUpTimeBytes() {
      java.lang.Object ref = startPickUpTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startPickUpTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string startPickUpTime = 5;</code>
     */
    public Builder setStartPickUpTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      startPickUpTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string startPickUpTime = 5;</code>
     */
    public Builder clearStartPickUpTime() {
      
      startPickUpTime_ = getDefaultInstance().getStartPickUpTime();
      onChanged();
      return this;
    }
    /**
     * <code>string startPickUpTime = 5;</code>
     */
    public Builder setStartPickUpTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      startPickUpTime_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object endPickUpTime_ = "";
    /**
     * <code>string endPickUpTime = 6;</code>
     */
    public java.lang.String getEndPickUpTime() {
      java.lang.Object ref = endPickUpTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endPickUpTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string endPickUpTime = 6;</code>
     */
    public com.google.protobuf.ByteString
        getEndPickUpTimeBytes() {
      java.lang.Object ref = endPickUpTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endPickUpTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string endPickUpTime = 6;</code>
     */
    public Builder setEndPickUpTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      endPickUpTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string endPickUpTime = 6;</code>
     */
    public Builder clearEndPickUpTime() {
      
      endPickUpTime_ = getDefaultInstance().getEndPickUpTime();
      onChanged();
      return this;
    }
    /**
     * <code>string endPickUpTime = 6;</code>
     */
    public Builder setEndPickUpTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      endPickUpTime_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:foodOffer.UpdateFoodOfferRequest)
  }

  // @@protoc_insertion_point(class_scope:foodOffer.UpdateFoodOfferRequest)
  private static final foodOffer.UpdateFoodOfferRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new foodOffer.UpdateFoodOfferRequest();
  }

  public static foodOffer.UpdateFoodOfferRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateFoodOfferRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateFoodOfferRequest>() {
    public UpdateFoodOfferRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdateFoodOfferRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateFoodOfferRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateFoodOfferRequest> getParserForType() {
    return PARSER;
  }

  public foodOffer.UpdateFoodOfferRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

