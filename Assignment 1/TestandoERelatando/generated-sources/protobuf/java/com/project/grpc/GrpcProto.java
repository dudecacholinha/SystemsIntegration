// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpcp.proto

package com.project.grpc;

public final class GrpcProto {
  private GrpcProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ConnectionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ConnectionReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ConnectionReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013grpcp.proto\"4\n\021ConnectionRequest\022\017\n\007ms" +
      "g_xml\030\001 \001(\t\022\016\n\006msg_pb\030\002 \001(\014\"0\n\017Connectio" +
      "nReply\022\016\n\006rp_xml\030\001 \001(\t\022\r\n\005rp_pb\030\002 \001(\0142D\n" +
      "\007Greeter\0229\n\017GreetAndConnect\022\022.Connection" +
      "Request\032\020.ConnectionReply\"\000B\037\n\020com.proje" +
      "ct.grpcB\tGrpcProtoP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ConnectionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ConnectionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ConnectionRequest_descriptor,
        new java.lang.String[] { "MsgXml", "MsgPb", });
    internal_static_ConnectionReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ConnectionReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ConnectionReply_descriptor,
        new java.lang.String[] { "RpXml", "RpPb", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}