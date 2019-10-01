// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpcp.proto

package com.project.grpc;

/**
 * Protobuf type {@code ConnectionReply}
 */
public  final class ConnectionReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ConnectionReply)
    ConnectionReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConnectionReply.newBuilder() to construct.
  private ConnectionReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConnectionReply() {
    rpXml_ = "";
    rpPb_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConnectionReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConnectionReply(
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
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            rpXml_ = bs;
            break;
          }
          case 18: {
            bitField0_ |= 0x00000002;
            rpPb_ = input.readBytes();
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
    return com.project.grpc.GrpcProto.internal_static_ConnectionReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.project.grpc.GrpcProto.internal_static_ConnectionReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.project.grpc.ConnectionReply.class, com.project.grpc.ConnectionReply.Builder.class);
  }

  private int bitField0_;
  public static final int RP_XML_FIELD_NUMBER = 1;
  private volatile java.lang.Object rpXml_;
  /**
   * <code>optional string rp_xml = 1;</code>
   */
  public boolean hasRpXml() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string rp_xml = 1;</code>
   */
  public java.lang.String getRpXml() {
    java.lang.Object ref = rpXml_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        rpXml_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string rp_xml = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRpXmlBytes() {
    java.lang.Object ref = rpXml_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rpXml_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RP_PB_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString rpPb_;
  /**
   * <code>optional bytes rp_pb = 2;</code>
   */
  public boolean hasRpPb() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional bytes rp_pb = 2;</code>
   */
  public com.google.protobuf.ByteString getRpPb() {
    return rpPb_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rpXml_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBytes(2, rpPb_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rpXml_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, rpPb_);
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
    if (!(obj instanceof com.project.grpc.ConnectionReply)) {
      return super.equals(obj);
    }
    com.project.grpc.ConnectionReply other = (com.project.grpc.ConnectionReply) obj;

    if (hasRpXml() != other.hasRpXml()) return false;
    if (hasRpXml()) {
      if (!getRpXml()
          .equals(other.getRpXml())) return false;
    }
    if (hasRpPb() != other.hasRpPb()) return false;
    if (hasRpPb()) {
      if (!getRpPb()
          .equals(other.getRpPb())) return false;
    }
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
    if (hasRpXml()) {
      hash = (37 * hash) + RP_XML_FIELD_NUMBER;
      hash = (53 * hash) + getRpXml().hashCode();
    }
    if (hasRpPb()) {
      hash = (37 * hash) + RP_PB_FIELD_NUMBER;
      hash = (53 * hash) + getRpPb().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.project.grpc.ConnectionReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.project.grpc.ConnectionReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.project.grpc.ConnectionReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.project.grpc.ConnectionReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.project.grpc.ConnectionReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.project.grpc.ConnectionReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.project.grpc.ConnectionReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.project.grpc.ConnectionReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.project.grpc.ConnectionReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.project.grpc.ConnectionReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.project.grpc.ConnectionReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.project.grpc.ConnectionReply parseFrom(
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
  public static Builder newBuilder(com.project.grpc.ConnectionReply prototype) {
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
   * Protobuf type {@code ConnectionReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ConnectionReply)
      com.project.grpc.ConnectionReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.project.grpc.GrpcProto.internal_static_ConnectionReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.project.grpc.GrpcProto.internal_static_ConnectionReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.project.grpc.ConnectionReply.class, com.project.grpc.ConnectionReply.Builder.class);
    }

    // Construct using com.project.grpc.ConnectionReply.newBuilder()
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
      rpXml_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      rpPb_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.project.grpc.GrpcProto.internal_static_ConnectionReply_descriptor;
    }

    @java.lang.Override
    public com.project.grpc.ConnectionReply getDefaultInstanceForType() {
      return com.project.grpc.ConnectionReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.project.grpc.ConnectionReply build() {
      com.project.grpc.ConnectionReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.project.grpc.ConnectionReply buildPartial() {
      com.project.grpc.ConnectionReply result = new com.project.grpc.ConnectionReply(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.rpXml_ = rpXml_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.rpPb_ = rpPb_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.project.grpc.ConnectionReply) {
        return mergeFrom((com.project.grpc.ConnectionReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.project.grpc.ConnectionReply other) {
      if (other == com.project.grpc.ConnectionReply.getDefaultInstance()) return this;
      if (other.hasRpXml()) {
        bitField0_ |= 0x00000001;
        rpXml_ = other.rpXml_;
        onChanged();
      }
      if (other.hasRpPb()) {
        setRpPb(other.getRpPb());
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
      com.project.grpc.ConnectionReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.project.grpc.ConnectionReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object rpXml_ = "";
    /**
     * <code>optional string rp_xml = 1;</code>
     */
    public boolean hasRpXml() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string rp_xml = 1;</code>
     */
    public java.lang.String getRpXml() {
      java.lang.Object ref = rpXml_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          rpXml_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string rp_xml = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRpXmlBytes() {
      java.lang.Object ref = rpXml_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rpXml_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string rp_xml = 1;</code>
     */
    public Builder setRpXml(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      rpXml_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string rp_xml = 1;</code>
     */
    public Builder clearRpXml() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rpXml_ = getDefaultInstance().getRpXml();
      onChanged();
      return this;
    }
    /**
     * <code>optional string rp_xml = 1;</code>
     */
    public Builder setRpXmlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      rpXml_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString rpPb_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes rp_pb = 2;</code>
     */
    public boolean hasRpPb() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bytes rp_pb = 2;</code>
     */
    public com.google.protobuf.ByteString getRpPb() {
      return rpPb_;
    }
    /**
     * <code>optional bytes rp_pb = 2;</code>
     */
    public Builder setRpPb(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      rpPb_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes rp_pb = 2;</code>
     */
    public Builder clearRpPb() {
      bitField0_ = (bitField0_ & ~0x00000002);
      rpPb_ = getDefaultInstance().getRpPb();
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


    // @@protoc_insertion_point(builder_scope:ConnectionReply)
  }

  // @@protoc_insertion_point(class_scope:ConnectionReply)
  private static final com.project.grpc.ConnectionReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.project.grpc.ConnectionReply();
  }

  public static com.project.grpc.ConnectionReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ConnectionReply>
      PARSER = new com.google.protobuf.AbstractParser<ConnectionReply>() {
    @java.lang.Override
    public ConnectionReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConnectionReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConnectionReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConnectionReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.project.grpc.ConnectionReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

