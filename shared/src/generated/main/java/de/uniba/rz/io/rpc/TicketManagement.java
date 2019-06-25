// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticketManagement.proto

package de.uniba.rz.io.rpc;

public final class TicketManagement {
  private TicketManagement() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TicketData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TicketData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TicketIDRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TicketIDRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TicketRequestEmpty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TicketRequestEmpty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllTicketResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllTicketResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_updateTicket_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_updateTicket_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AutoNewTicketRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AutoNewTicketRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ticketManagement.proto\"\337\002\n\nTicketData\022" +
      "\n\n\002Id\030\001 \001(\005\022\020\n\010reporter\030\002 \001(\t\022\r\n\005topic\030\003" +
      " \001(\t\022\023\n\013description\030\004 \001(\t\022\036\n\004type\030\005 \001(\0162" +
      "\020.TicketData.Type\022&\n\010priority\030\006 \001(\0162\024.Ti" +
      "cketData.Priority\022\"\n\006status\030\007 \001(\0162\022.Tick" +
      "etData.Status\"8\n\004Type\022\010\n\004TASK\020\000\022\017\n\013ENHAN" +
      "CEMENT\020\001\022\007\n\003BUG\020\002\022\014\n\010QUESTION\020\003\".\n\010Prior" +
      "ity\022\014\n\010CRITICAL\020\000\022\t\n\005MAJOR\020\001\022\t\n\005MINOR\020\002\"" +
      "9\n\006Status\022\007\n\003NEW\020\000\022\014\n\010ACCEPTED\020\001\022\014\n\010REJE" +
      "CTED\020\002\022\n\n\006CLOSED\020\003\"#\n\017TicketIDRequest\022\020\n" +
      "\010Ticketid\030\001 \001(\005\" \n\022TicketRequestEmpty\022\n\n" +
      "\002ID\030\001 \001(\005\"7\n\024GetAllTicketResponse\022\037\n\ntic" +
      "ketData\030\001 \003(\0132\013.TicketData\"{\n\014updateTick" +
      "et\022\n\n\002ID\030\001 \001(\005\022$\n\006status\030\002 \001(\0162\024.updateT" +
      "icket.Status\"9\n\006Status\022\007\n\003NEW\020\000\022\014\n\010ACCEP" +
      "TED\020\001\022\014\n\010REJECTED\020\002\022\n\n\006CLOSED\020\003\"-\n\024AutoN" +
      "ewTicketRequest\022\025\n\rmax_ticket_id\030\001 \001(\0052\260" +
      "\002\n\rTicketService\022*\n\014createTicket\022\013.Ticke" +
      "tData\032\013.TicketData\"\000\022<\n\014getAllTicket\022\023.T" +
      "icketRequestEmpty\032\025.GetAllTicketResponse" +
      "\"\000\0223\n\020SearchTicketById\022\020.TicketIDRequest" +
      "\032\013.TicketData\"\000\0229\n\031updateTicketStatusSer" +
      "vice\022\r.updateTicket\032\013.TicketData\"\000\022E\n\017St" +
      "reamNewTicket\022\025.AutoNewTicketRequest\032\025.G" +
      "etAllTicketResponse\"\000(\0010\001B.\n\022de.uniba.rz" +
      ".io.rpcB\020TicketManagementP\001\242\002\003RTGb\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_TicketData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TicketData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TicketData_descriptor,
        new java.lang.String[] { "Id", "Reporter", "Topic", "Description", "Type", "Priority", "Status", });
    internal_static_TicketIDRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_TicketIDRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TicketIDRequest_descriptor,
        new java.lang.String[] { "Ticketid", });
    internal_static_TicketRequestEmpty_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_TicketRequestEmpty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TicketRequestEmpty_descriptor,
        new java.lang.String[] { "ID", });
    internal_static_GetAllTicketResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GetAllTicketResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllTicketResponse_descriptor,
        new java.lang.String[] { "TicketData", });
    internal_static_updateTicket_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_updateTicket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_updateTicket_descriptor,
        new java.lang.String[] { "ID", "Status", });
    internal_static_AutoNewTicketRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_AutoNewTicketRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AutoNewTicketRequest_descriptor,
        new java.lang.String[] { "MaxTicketId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
