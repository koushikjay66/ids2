// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticketManagement.proto

package de.uniba.rz.io.rpc;

public interface TicketDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TicketData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 Id = 1;</code>
   */
  int getId();

  /**
   * <code>string reporter = 2;</code>
   */
  java.lang.String getReporter();
  /**
   * <code>string reporter = 2;</code>
   */
  com.google.protobuf.ByteString
      getReporterBytes();

  /**
   * <code>string topic = 3;</code>
   */
  java.lang.String getTopic();
  /**
   * <code>string topic = 3;</code>
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <code>string description = 4;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.TicketData.Type type = 5;</code>
   */
  int getTypeValue();
  /**
   * <code>.TicketData.Type type = 5;</code>
   */
  de.uniba.rz.io.rpc.TicketData.Type getType();

  /**
   * <code>.TicketData.Priority priority = 6;</code>
   */
  int getPriorityValue();
  /**
   * <code>.TicketData.Priority priority = 6;</code>
   */
  de.uniba.rz.io.rpc.TicketData.Priority getPriority();

  /**
   * <code>.TicketData.Status status = 7;</code>
   */
  int getStatusValue();
  /**
   * <code>.TicketData.Status status = 7;</code>
   */
  de.uniba.rz.io.rpc.TicketData.Status getStatus();
}
