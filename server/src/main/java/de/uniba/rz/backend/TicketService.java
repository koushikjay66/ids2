package de.uniba.rz.backend;

import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import de.uniba.rz.entities.Priority;
import de.uniba.rz.entities.Status;
import de.uniba.rz.entities.Ticket;
import de.uniba.rz.io.rpc.AutoNewTicketRequest;
import de.uniba.rz.io.rpc.GetAllTicketResponse;
import de.uniba.rz.io.rpc.TicketData;
import de.uniba.rz.io.rpc.TicketData.Builder;
import de.uniba.rz.io.rpc.TicketIDRequest;
import de.uniba.rz.io.rpc.TicketRequestEmpty;
import de.uniba.rz.io.rpc.TicketServiceGrpc.TicketServiceImplBase;
import io.grpc.stub.StreamObserver;

public class TicketService extends TicketServiceImplBase{
	
	/*
	 * This list is to update currently connected client list. - Understanding maybe wrong . But will try my best to understand 
	 * and complete the assignment. 
	 */
	private static Set<StreamObserver<GetAllTicketResponse>> connected_clients = ConcurrentHashMap.newKeySet();
	/**
	 * GRPC Just gives us the class name, we need to implement all the service definations.
	 */
	/**
	 * Create ticket method gets the ticket data and returns the same ticket as response. 
	 */
	@Override
	public void createTicket(TicketData request , StreamObserver<TicketData> responseObserver) {
		System.out.println("Requested to store a new Ticket");

		Ticket t = SimpleTicketStore.CreateTicket(
				request.getReporter()
				,request.getTopic()
				,de.uniba.rz.entities.Status.values()[request.getStatusValue()]
						,request.getDescription()
						,de.uniba.rz.entities.Type.values()[request.getTypeValue()]
								,Priority.values()[request.getPriorityValue()]
				);

		TicketData tdata = Ticket2TicketData(t);

		responseObserver.onNext(tdata);
		responseObserver.onCompleted();

	}

	@Override
	public void getAllTicket(TicketRequestEmpty request, StreamObserver<GetAllTicketResponse> responseObserver) {

		System.out.println("Requested to get all Ticket.");
		List<TicketData> ticktDataList = new ArrayList<TicketData>();
		for(Ticket t : SimpleTicketStore.getTickets()) {
			ticktDataList.add(Ticket2TicketData(t));

		}
		Iterable<TicketData> ticktDataIterable=ticktDataList;

		GetAllTicketResponse response = GetAllTicketResponse.newBuilder().addAllTicketData(ticktDataIterable).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void searchTicketById(TicketIDRequest request, StreamObserver<TicketData>responseObserver) {


	}


	@Override
	public void updateTicketStatusService(de.uniba.rz.io.rpc.updateTicket request,
			io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.TicketData> responseObserver) {
		System.out.println("Requested to update ticket status");

		Ticket t =SimpleTicketStore.UpdateStatus(request.getID(), Status.values()[request.getStatusValue()]);

		if(t==null) {
			t=new Ticket();
		}
		TicketData tdata = Ticket2TicketData(t);

		responseObserver.onNext(tdata);
		responseObserver.onCompleted();

	}
	/**
	 * Helper Method ticket to TicketData . For GRPC
	 */

	private TicketData Ticket2TicketData(Ticket t) {

		Builder ticketBuilder = TicketData.newBuilder();
		ticketBuilder.setDescription(t.getDescription());
		ticketBuilder.setId(t.getId());
		ticketBuilder.setPriority(de.uniba.rz.io.rpc.TicketData.Priority.values()[t.getPriority().ordinal()]);
		ticketBuilder.setReporter(t.getReporter());
		ticketBuilder.setStatus(de.uniba.rz.io.rpc.TicketData.Status.values()[t.getStatus().ordinal()]);
		ticketBuilder.setTopic(t.getTopic());
		ticketBuilder.setType(de.uniba.rz.io.rpc.TicketData.Type.values()[t.getType().ordinal()]);

		return ticketBuilder.build();

	}


	@Override
	public io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.AutoNewTicketRequest> streamNewTicket(
			io.grpc.stub.StreamObserver<de.uniba.rz.io.rpc.GetAllTicketResponse> responseObserver) {
		System.out.println("Requested autoupdate list");

		/*
		 * Added the currently connected clients in the list.
		 */
		connected_clients.add(responseObserver);
		
		return new StreamObserver<AutoNewTicketRequest>() {

			@Override
			public void onNext(AutoNewTicketRequest value) {
				// TODO Auto-generated method stub
				
				System.out.println("On Next is what!!");
				List<TicketData> ticktDataList = new ArrayList<TicketData>();
				System.out.println("Total Ticket is : "+ ticktDataList.size());
				for(Ticket t : SimpleTicketStore.getTickets()) {
					ticktDataList.add(Ticket2TicketData(t));
				}
				Iterable<TicketData> ticktDataIterable=ticktDataList;
				
				
				int i=0;
				for(StreamObserver<GetAllTicketResponse> observer: connected_clients) {
					System.out.println("Writing down to clietns");
					observer.onNext(GetAllTicketResponse.newBuilder().addAllTicketData(ticktDataIterable).build());
					i++;
				}
				System.out.println(i);
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
				System.out.println("Got Error in writing the ticket");
				connected_clients.remove(responseObserver);
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				System.out.println("Completed Operations");
				connected_clients.remove(responseObserver);
			}
		};
	}

}
