// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpcp.proto

package com.project.grpc;

public interface ConnectionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ConnectionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *Talvez posssa mudar para optional
   * </pre>
   *
   * <code>optional string msg_xml = 1;</code>
   */
  boolean hasMsgXml();
  /**
   * <pre>
   *Talvez posssa mudar para optional
   * </pre>
   *
   * <code>optional string msg_xml = 1;</code>
   */
  java.lang.String getMsgXml();
  /**
   * <pre>
   *Talvez posssa mudar para optional
   * </pre>
   *
   * <code>optional string msg_xml = 1;</code>
   */
  com.google.protobuf.ByteString
      getMsgXmlBytes();

  /**
   * <pre>
   *Para mandar as cenas dos protobuffers atraves de um array de bytes
   * </pre>
   *
   * <code>optional bytes msg_pb = 2;</code>
   */
  boolean hasMsgPb();
  /**
   * <pre>
   *Para mandar as cenas dos protobuffers atraves de um array de bytes
   * </pre>
   *
   * <code>optional bytes msg_pb = 2;</code>
   */
  com.google.protobuf.ByteString getMsgPb();
}
