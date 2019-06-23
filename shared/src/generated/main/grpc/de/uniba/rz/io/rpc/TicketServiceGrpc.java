package de.uniba.rz.io.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: ticketManagement.proto")
public final class TicketServiceGrpc {

  private TicketServiceGrpc() {}

  public static final String SERVICE_NAME = "TicketService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.TicketData,
      de.uniba.rz.io.rpc.TicketData> getCreateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTicket",
      requestType = de.uniba.rz.io.rpc.TicketData.class,
      responseType = de.uniba.rz.io.rpc.TicketData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.TicketData,
      de.uniba.rz.io.rpc.TicketData> getCreateTicketMethod() {
    io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.TicketData, de.uniba.rz.io.rpc.TicketData> getCreateTicketMethod;
    if ((getCreateTicketMethod = TicketServiceGrpc.getCreateTicketMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getCreateTicketMethod = TicketServiceGrpc.getCreateTicketMethod) == null) {
          TicketServiceGrpc.getCreateTicketMethod = getCreateTicketMethod = 
              io.grpc.MethodDescriptor.<de.uniba.rz.io.rpc.TicketData, de.uniba.rz.io.rpc.TicketData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TicketService", "createTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.TicketData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.TicketData.getDefaultInstance()))
                  .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("createTicket"))
                  .build();
          }
        }
     }
     return getCreateTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.TicketRequestEmpty,
      de.uniba.rz.io.rpc.GetAllTicketResponse> getGetAllTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllTicket",
      requestType = de.uniba.rz.io.rpc.TicketRequestEmpty.class,
      responseType = de.uniba.rz.io.rpc.GetAllTicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.TicketRequestEmpty,
      de.uniba.rz.io.rpc.GetAllTicketResponse> getGetAllTicketMethod() {
    io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.TicketRequestEmpty, de.uniba.rz.io.rpc.GetAllTicketResponse> getGetAllTicketMethod;
    if ((getGetAllTicketMethod = TicketServiceGrpc.getGetAllTicketMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getGetAllTicketMethod = TicketServiceGrpc.getGetAllTicketMethod) == null) {
          TicketServiceGrpc.getGetAllTicketMethod = getGetAllTicketMethod = 
              io.grpc.MethodDescriptor.<de.uniba.rz.io.rpc.TicketRequestEmpty, de.uniba.rz.io.rpc.GetAllTicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TicketService", "getAllTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.TicketRequestEmpty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.GetAllTicketResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("getAllTicket"))
                  .build();
          }
        }
     }
     return getGetAllTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.TicketIDRequest,
      de.uniba.rz.io.rpc.TicketData> getSearchTicketByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchTicketById",
      requestType = de.uniba.rz.io.rpc.TicketIDRequest.class,
      responseType = de.uniba.rz.io.rpc.TicketData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.TicketIDRequest,
      de.uniba.rz.io.rpc.TicketData> getSearchTicketByIdMethod() {
    io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.TicketIDRequest, de.uniba.rz.io.rpc.TicketData> getSearchTicketByIdMethod;
    if ((getSearchTicketByIdMethod = TicketServiceGrpc.getSearchTicketByIdMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getSearchTicketByIdMethod = TicketServiceGrpc.getSearchTicketByIdMethod) == null) {
          TicketServiceGrpc.getSearchTicketByIdMethod = getSearchTicketByIdMethod = 
              io.grpc.MethodDescriptor.<de.uniba.rz.io.rpc.TicketIDRequest, de.uniba.rz.io.rpc.TicketData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TicketService", "SearchTicketById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.TicketIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.TicketData.getDefaultInstance()))
                  .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("SearchTicketById"))
                  .build();
          }
        }
     }
     return getSearchTicketByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.updateTicket,
      de.uniba.rz.io.rpc.TicketData> getUpdateTicketStatusServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateTicketStatusService",
      requestType = de.uniba.rz.io.rpc.updateTicket.class,
      responseType = de.uniba.rz.io.rpc.TicketData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.updateTicket,
      de.uniba.rz.io.rpc.TicketData> getUpdateTicketStatusServiceMethod() {
    io.grpc.MethodDescriptor<de.uniba.rz.io.rpc.updateTicket, de.uniba.rz.io.rpc.TicketData> getUpdateTicketStatusServiceMethod;
    if ((getUpdateTicketStatusServiceMethod = TicketServiceGrpc.getUpdateTicketStatusServiceMethod) == null) {
      synchronized (TicketServiceGrpc.class) {
        if ((getUpdateTicketStatusServiceMethod = TicketServiceGrpc.getUpdateTicketStatusServiceMethod) == null) {
          TicketServiceGrpc.getUpdateTicketStatusServiceMethod = getUpdateTicketStatusServiceMethod = 
              io.grpc.MethodDescriptor.<de.uniba.rz.io.rpc.updateTicket, de.uniba.rz.io.rpc.TicketData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TicketService", "updateTicketStatusService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.updateTicket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  de.uniba.rz.io.rpc.TicketData.getDefaultInstance()))
                  .setSchemaDescriptor(new TicketServiceMethodDescriptorSupplier("updateTicketStatusService"))
                  .build();
          }
        }
     }
     return getUpdateTicketStatusServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TicketServiceStub newStub(io.grpc.Channel channel) {
    return new TicketServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TicketServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TicketServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TicketServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TicketServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TicketServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTicket(de.uniba.rz.io.rpc.TicketData request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.TicketData> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTicketMethod(), responseObserver);
    }

    /**
     */
    public void getAllTicket(de.uniba.rz.io.rpc.TicketRequestEmpty request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.GetAllTicketResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllTicketMethod(), responseObserver);
    }

    /**
     */
    public void searchTicketById(de.uniba.rz.io.rpc.TicketIDRequest request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.TicketData> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchTicketByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateTicketStatusService(de.uniba.rz.io.rpc.updateTicket request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.TicketData> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTicketStatusServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.uniba.rz.io.rpc.TicketData,
                de.uniba.rz.io.rpc.TicketData>(
                  this, METHODID_CREATE_TICKET)))
          .addMethod(
            getGetAllTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.uniba.rz.io.rpc.TicketRequestEmpty,
                de.uniba.rz.io.rpc.GetAllTicketResponse>(
                  this, METHODID_GET_ALL_TICKET)))
          .addMethod(
            getSearchTicketByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.uniba.rz.io.rpc.TicketIDRequest,
                de.uniba.rz.io.rpc.TicketData>(
                  this, METHODID_SEARCH_TICKET_BY_ID)))
          .addMethod(
            getUpdateTicketStatusServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                de.uniba.rz.io.rpc.updateTicket,
                de.uniba.rz.io.rpc.TicketData>(
                  this, METHODID_UPDATE_TICKET_STATUS_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class TicketServiceStub extends io.grpc.stub.AbstractStub<TicketServiceStub> {
    private TicketServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TicketServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TicketServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTicket(de.uniba.rz.io.rpc.TicketData request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.TicketData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllTicket(de.uniba.rz.io.rpc.TicketRequestEmpty request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.GetAllTicketResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchTicketById(de.uniba.rz.io.rpc.TicketIDRequest request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.TicketData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchTicketByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTicketStatusService(de.uniba.rz.io.rpc.updateTicket request,
        io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.TicketData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTicketStatusServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TicketServiceBlockingStub extends io.grpc.stub.AbstractStub<TicketServiceBlockingStub> {
    private TicketServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TicketServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TicketServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public de.uniba.rz.io.rpc.TicketData createTicket(de.uniba.rz.io.rpc.TicketData request) {
      return blockingUnaryCall(
          getChannel(), getCreateTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public de.uniba.rz.io.rpc.GetAllTicketResponse getAllTicket(de.uniba.rz.io.rpc.TicketRequestEmpty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public de.uniba.rz.io.rpc.TicketData searchTicketById(de.uniba.rz.io.rpc.TicketIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchTicketByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public de.uniba.rz.io.rpc.TicketData updateTicketStatusService(de.uniba.rz.io.rpc.updateTicket request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTicketStatusServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TicketServiceFutureStub extends io.grpc.stub.AbstractStub<TicketServiceFutureStub> {
    private TicketServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TicketServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TicketServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.uniba.rz.io.rpc.TicketData> createTicket(
        de.uniba.rz.io.rpc.TicketData request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.uniba.rz.io.rpc.GetAllTicketResponse> getAllTicket(
        de.uniba.rz.io.rpc.TicketRequestEmpty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.uniba.rz.io.rpc.TicketData> searchTicketById(
        de.uniba.rz.io.rpc.TicketIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchTicketByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<de.uniba.rz.io.rpc.TicketData> updateTicketStatusService(
        de.uniba.rz.io.rpc.updateTicket request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTicketStatusServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TICKET = 0;
  private static final int METHODID_GET_ALL_TICKET = 1;
  private static final int METHODID_SEARCH_TICKET_BY_ID = 2;
  private static final int METHODID_UPDATE_TICKET_STATUS_SERVICE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TicketServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TicketServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TICKET:
          serviceImpl.createTicket((de.uniba.rz.io.rpc.TicketData) request,
              (io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.TicketData>) responseObserver);
          break;
        case METHODID_GET_ALL_TICKET:
          serviceImpl.getAllTicket((de.uniba.rz.io.rpc.TicketRequestEmpty) request,
              (io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.GetAllTicketResponse>) responseObserver);
          break;
        case METHODID_SEARCH_TICKET_BY_ID:
          serviceImpl.searchTicketById((de.uniba.rz.io.rpc.TicketIDRequest) request,
              (io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.TicketData>) responseObserver);
          break;
        case METHODID_UPDATE_TICKET_STATUS_SERVICE:
          serviceImpl.updateTicketStatusService((de.uniba.rz.io.rpc.updateTicket) request,
              (io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.TicketData>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TicketServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return de.uniba.rz.io.rpc.TicketManagement.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TicketService");
    }
  }

  private static final class TicketServiceFileDescriptorSupplier
      extends TicketServiceBaseDescriptorSupplier {
    TicketServiceFileDescriptorSupplier() {}
  }

  private static final class TicketServiceMethodDescriptorSupplier
      extends TicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TicketServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TicketServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TicketServiceFileDescriptorSupplier())
              .addMethod(getCreateTicketMethod())
              .addMethod(getGetAllTicketMethod())
              .addMethod(getSearchTicketByIdMethod())
              .addMethod(getUpdateTicketStatusServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
