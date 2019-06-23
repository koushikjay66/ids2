package de.uniba.rz.backend;

import de.uniba.rz.entities.Priority;
import de.uniba.rz.io.rpc.GetAllTicketResponse;
import de.uniba.rz.io.rpc.TicketData;
import de.uniba.rz.io.rpc.TicketData.Builder;
import de.uniba.rz.io.rpc.TicketData.Status;
import de.uniba.rz.io.rpc.TicketData.Type;
import de.uniba.rz.io.rpc.TicketIDRequest;
import de.uniba.rz.io.rpc.TicketRequestEmpty;
import de.uniba.rz.io.rpc.TicketServiceGrpc.TicketServiceImplBase;
import io.grpc.stub.StreamObserver;

public class TicketService extends TicketServiceImplBase{


	/**
	 * GRPC Just gives us the class name, we need to implement all the service definations.
	 */
	/**
	 * Create ticket method gets the ticket data and returns the same ticket as response. 
	 */
	@Override
	public void createTicket(TicketData request , StreamObserver<TicketData> responseObserver) {


	}

	@Override
	public void getAllTicket(TicketRequestEmpty request, StreamObserver<GetAllTicketResponse> responseObserver) {

		System.out.println("Requested to get all Ticket..A fake thing is being generated");
		Builder x = TicketData.newBuilder().setDescription("A Sample Ticket");
		x.setId(0);
		x.setPriority(de.uniba.rz.io.rpc.TicketData.Priority.CRITICAL);
		x.setReporter("koushikjay66");
		x.setStatus(Status.ACCEPTED);
		x.setTopic("Testing Faze");
		x.setType(Type.BUG);

		TicketData y=x.build();

		GetAllTicketResponse response = GetAllTicketResponse.newBuilder().addTicketData(y).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void searchTicketById(TicketIDRequest request, StreamObserver<TicketData>responseObserver) {


	}



}
