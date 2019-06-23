package de.uniba.rz.backend;

import java.util.HashMap;

import de.uniba.rz.entities.Priority;
import de.uniba.rz.entities.Ticket;
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

		System.out.println("Requested to get all Ticket..A fake thing is being generated");
		Builder x = TicketData.newBuilder().setDescription("A Sample Ticket");
		x.setId(0);
		x.setPriority(de.uniba.rz.io.rpc.TicketData.Priority.CRITICAL);
		x.setReporter("koushikjay66");
		x.setStatus(Status.ACCEPTED);
		x.setTopic("Testing Faze");
		x.setType(Type.BUG);

		TicketData y=x.build();
		System.out.println(y.getDescription());

		GetAllTicketResponse response = GetAllTicketResponse.newBuilder().addTicketData(y).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void searchTicketById(TicketIDRequest request, StreamObserver<TicketData>responseObserver) {


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



}
