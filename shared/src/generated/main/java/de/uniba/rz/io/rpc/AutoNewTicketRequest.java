// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticketManagement.proto

package de.uniba.rz.io.rpc;

/**
 * Protobuf type {@code AutoNewTicketRequest}
 */
public  final class AutoNewTicketRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AutoNewTicketRequest)
    AutoNewTicketRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AutoNewTicketRequest.newBuilder() to construct.
  private AutoNewTicketRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AutoNewTicketRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AutoNewTicketRequest(
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
          case 8: {

            maxTicketId_ = input.readInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return de.uniba.rz.io.rpc.TicketManagement.internal_static_AutoNewTicketRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return de.uniba.rz.io.rpc.TicketManagement.internal_static_AutoNewTicketRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            de.uniba.rz.io.rpc.AutoNewTicketRequest.class, de.uniba.rz.io.rpc.AutoNewTicketRequest.Builder.class);
  }

  public static final int MAX_TICKET_ID_FIELD_NUMBER = 1;
  private int maxTicketId_;
  /**
   * <code>int32 max_ticket_id = 1;</code>
   */
  public int getMaxTicketId() {
    return maxTicketId_;
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
    if (maxTicketId_ != 0) {
      output.writeInt32(1, maxTicketId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxTicketId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, maxTicketId_);
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
    if (!(obj instanceof de.uniba.rz.io.rpc.AutoNewTicketRequest)) {
      return super.equals(obj);
    }
    de.uniba.rz.io.rpc.AutoNewTicketRequest other = (de.uniba.rz.io.rpc.AutoNewTicketRequest) obj;

    if (getMaxTicketId()
        != other.getMaxTicketId()) return false;
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
    hash = (37 * hash) + MAX_TICKET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMaxTicketId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static de.uniba.rz.io.rpc.AutoNewTicketRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.uniba.rz.io.rpc.AutoNewTicketRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.uniba.rz.io.rpc.AutoNewTicketRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.uniba.rz.io.rpc.AutoNewTicketRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.uniba.rz.io.rpc.AutoNewTicketRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.uniba.rz.io.rpc.AutoNewTicketRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.uniba.rz.io.rpc.AutoNewTicketRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static de.uniba.rz.io.rpc.AutoNewTicketRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static de.uniba.rz.io.rpc.AutoNewTicketRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static de.uniba.rz.io.rpc.AutoNewTicketRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static de.uniba.rz.io.rpc.AutoNewTicketRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static de.uniba.rz.io.rpc.AutoNewTicketRequest parseFrom(
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
  public static Builder newBuilder(de.uniba.rz.io.rpc.AutoNewTicketRequest prototype) {
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
   * Protobuf type {@code AutoNewTicketRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AutoNewTicketRequest)
      de.uniba.rz.io.rpc.AutoNewTicketRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return de.uniba.rz.io.rpc.TicketManagement.internal_static_AutoNewTicketRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return de.uniba.rz.io.rpc.TicketManagement.internal_static_AutoNewTicketRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              de.uniba.rz.io.rpc.AutoNewTicketRequest.class, de.uniba.rz.io.rpc.AutoNewTicketRequest.Builder.class);
    }

    // Construct using de.uniba.rz.io.rpc.AutoNewTicketRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      maxTicketId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return de.uniba.rz.io.rpc.TicketManagement.internal_static_AutoNewTicketRequest_descriptor;
    }

    @java.lang.Override
    public de.uniba.rz.io.rpc.AutoNewTicketRequest getDefaultInstanceForType() {
      return de.uniba.rz.io.rpc.AutoNewTicketRequest.getDefaultInstance();
    }

    @java.lang.Override
    public de.uniba.rz.io.rpc.AutoNewTicketRequest build() {
      de.uniba.rz.io.rpc.AutoNewTicketRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public de.uniba.rz.io.rpc.AutoNewTicketRequest buildPartial() {
      de.uniba.rz.io.rpc.AutoNewTicketRequest result = new de.uniba.rz.io.rpc.AutoNewTicketRequest(this);
      result.maxTicketId_ = maxTicketId_;
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
      if (other instanceof de.uniba.rz.io.rpc.AutoNewTicketRequest) {
        return mergeFrom((de.uniba.rz.io.rpc.AutoNewTicketRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(de.uniba.rz.io.rpc.AutoNewTicketRequest other) {
      if (other == de.uniba.rz.io.rpc.AutoNewTicketRequest.getDefaultInstance()) return this;
      if (other.getMaxTicketId() != 0) {
        setMaxTicketId(other.getMaxTicketId());
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
      de.uniba.rz.io.rpc.AutoNewTicketRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (de.uniba.rz.io.rpc.AutoNewTicketRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int maxTicketId_ ;
    /**
     * <code>int32 max_ticket_id = 1;</code>
     */
    public int getMaxTicketId() {
      return maxTicketId_;
    }
    /**
     * <code>int32 max_ticket_id = 1;</code>
     */
    public Builder setMaxTicketId(int value) {
      
      maxTicketId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_ticket_id = 1;</code>
     */
    public Builder clearMaxTicketId() {
      
      maxTicketId_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:AutoNewTicketRequest)
  }

  // @@protoc_insertion_point(class_scope:AutoNewTicketRequest)
  private static final de.uniba.rz.io.rpc.AutoNewTicketRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new de.uniba.rz.io.rpc.AutoNewTicketRequest();
  }

  public static de.uniba.rz.io.rpc.AutoNewTicketRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoNewTicketRequest>
      PARSER = new com.google.protobuf.AbstractParser<AutoNewTicketRequest>() {
    @java.lang.Override
    public AutoNewTicketRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AutoNewTicketRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AutoNewTicketRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoNewTicketRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public de.uniba.rz.io.rpc.AutoNewTicketRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

