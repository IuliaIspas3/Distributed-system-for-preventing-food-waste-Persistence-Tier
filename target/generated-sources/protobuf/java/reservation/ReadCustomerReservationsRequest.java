// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

package reservation;

/**
 * Protobuf type {@code reservation.ReadCustomerReservationsRequest}
 */
public  final class ReadCustomerReservationsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:reservation.ReadCustomerReservationsRequest)
    ReadCustomerReservationsRequestOrBuilder {
  // Use ReadCustomerReservationsRequest.newBuilder() to construct.
  private ReadCustomerReservationsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadCustomerReservationsRequest() {
    customerId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ReadCustomerReservationsRequest(
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

            customerId_ = input.readInt32();
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
    return reservation.ReservationServiceOuterClass.internal_static_reservation_ReadCustomerReservationsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return reservation.ReservationServiceOuterClass.internal_static_reservation_ReadCustomerReservationsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            reservation.ReadCustomerReservationsRequest.class, reservation.ReadCustomerReservationsRequest.Builder.class);
  }

  public static final int CUSTOMERID_FIELD_NUMBER = 1;
  private int customerId_;
  /**
   * <code>int32 customerId = 1;</code>
   */
  public int getCustomerId() {
    return customerId_;
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
    if (customerId_ != 0) {
      output.writeInt32(1, customerId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (customerId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, customerId_);
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
    if (!(obj instanceof reservation.ReadCustomerReservationsRequest)) {
      return super.equals(obj);
    }
    reservation.ReadCustomerReservationsRequest other = (reservation.ReadCustomerReservationsRequest) obj;

    boolean result = true;
    result = result && (getCustomerId()
        == other.getCustomerId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CUSTOMERID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static reservation.ReadCustomerReservationsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static reservation.ReadCustomerReservationsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static reservation.ReadCustomerReservationsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static reservation.ReadCustomerReservationsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static reservation.ReadCustomerReservationsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static reservation.ReadCustomerReservationsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static reservation.ReadCustomerReservationsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static reservation.ReadCustomerReservationsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static reservation.ReadCustomerReservationsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static reservation.ReadCustomerReservationsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static reservation.ReadCustomerReservationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static reservation.ReadCustomerReservationsRequest parseFrom(
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
  public static Builder newBuilder(reservation.ReadCustomerReservationsRequest prototype) {
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
   * Protobuf type {@code reservation.ReadCustomerReservationsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:reservation.ReadCustomerReservationsRequest)
      reservation.ReadCustomerReservationsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return reservation.ReservationServiceOuterClass.internal_static_reservation_ReadCustomerReservationsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return reservation.ReservationServiceOuterClass.internal_static_reservation_ReadCustomerReservationsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              reservation.ReadCustomerReservationsRequest.class, reservation.ReadCustomerReservationsRequest.Builder.class);
    }

    // Construct using reservation.ReadCustomerReservationsRequest.newBuilder()
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
      customerId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return reservation.ReservationServiceOuterClass.internal_static_reservation_ReadCustomerReservationsRequest_descriptor;
    }

    public reservation.ReadCustomerReservationsRequest getDefaultInstanceForType() {
      return reservation.ReadCustomerReservationsRequest.getDefaultInstance();
    }

    public reservation.ReadCustomerReservationsRequest build() {
      reservation.ReadCustomerReservationsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public reservation.ReadCustomerReservationsRequest buildPartial() {
      reservation.ReadCustomerReservationsRequest result = new reservation.ReadCustomerReservationsRequest(this);
      result.customerId_ = customerId_;
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
      if (other instanceof reservation.ReadCustomerReservationsRequest) {
        return mergeFrom((reservation.ReadCustomerReservationsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(reservation.ReadCustomerReservationsRequest other) {
      if (other == reservation.ReadCustomerReservationsRequest.getDefaultInstance()) return this;
      if (other.getCustomerId() != 0) {
        setCustomerId(other.getCustomerId());
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
      reservation.ReadCustomerReservationsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (reservation.ReadCustomerReservationsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int customerId_ ;
    /**
     * <code>int32 customerId = 1;</code>
     */
    public int getCustomerId() {
      return customerId_;
    }
    /**
     * <code>int32 customerId = 1;</code>
     */
    public Builder setCustomerId(int value) {
      
      customerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 customerId = 1;</code>
     */
    public Builder clearCustomerId() {
      
      customerId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:reservation.ReadCustomerReservationsRequest)
  }

  // @@protoc_insertion_point(class_scope:reservation.ReadCustomerReservationsRequest)
  private static final reservation.ReadCustomerReservationsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new reservation.ReadCustomerReservationsRequest();
  }

  public static reservation.ReadCustomerReservationsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadCustomerReservationsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ReadCustomerReservationsRequest>() {
    public ReadCustomerReservationsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReadCustomerReservationsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReadCustomerReservationsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadCustomerReservationsRequest> getParserForType() {
    return PARSER;
  }

  public reservation.ReadCustomerReservationsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

