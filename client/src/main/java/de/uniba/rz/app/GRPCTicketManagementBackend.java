package de.uniba.rz.app;

import java.util.ArrayList;
import java.util.List;


import de.uniba.rz.entities.Priority;
import de.uniba.rz.entities.Status;
import de.uniba.rz.entities.Ticket;
import de.uniba.rz.entities.TicketException;
import de.uniba.rz.entities.Type;
import de.uniba.rz.io.rpc.AutoNewTicketRequest;
import de.uniba.rz.io.rpc.GetAllTicketResponse;
import de.uniba.rz.io.rpc.TicketData;
import de.uniba.rz.io.rpc.TicketRequestEmpty;
import de.uniba.rz.io.rpc.TicketServiceGrpc;
import de.uniba.rz.io.rpc.TicketData.Builder;
import de.uniba.rz.io.rpc.TicketServiceGrpc.TicketServiceBlockingStub;
import de.uniba.rz.io.rpc.TicketServiceGrpc.TicketServiceStub;
import de.uniba.rz.io.rpc.updateTicket;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import io.grpc.stub.StreamObservers;

public class GRPCTicketManagementBackend implements TicketManagementBackend {

	private final String host;
	private final int port;
	private final ManagedChannel channel;
	private final TicketServiceBlockingStub syncStub;
	private final TicketServiceStub asycStub;

	public GRPCTicketManagementBackend(String host , String port) {
		System.out.println("Client Started as GRPC Service");
		// TODO Auto-generated constructor stub
		this.host=host;
		this.port=Integer.parseInt(port);
		this.channel=ManagedChannelBuilder.forAddress(this.host, this.port).usePlaintext().build();
		this.syncStub=TicketServiceGrpc.newBlockingStub(this.channel);
		this.asycStub=TicketServiceGrpc.newStub(this.channel);

		xx();
	}

	/*
	 * Block that will be responsible to run 
	 */
	public void xx() {

		new AutoUpdateFields(this.asycStub).start();

	}
	@Override
	public void triggerShutdown() {
		// TODO Auto-generated method stub

	}

	@Override
	public Ticket createNewTicket(String reporter, String topic, String description, Type type, Priority priority)
			throws TicketException {
		// TODO Auto-generated method stub
		System.out.println("Creating new Ticket Now!");
		Ticket t = new Ticket(0,reporter , topic , description, type , priority);

		TicketData tData = Ticket2TicketData(t);
		tData = this.syncStub.createTicket(tData);
		return TicketData2Ticket(tData);
	}

	@Override
	public List<Ticket> getAllTickets() throws TicketException {
		// TODO Auto-generated method stub
		System.out.println("Calling to get all tickets");
		GetAllTicketResponse response = this.syncStub.getAllTicket(TicketRequestEmpty.newBuilder().setID(0).build());
		List<Ticket> ticketList = new ArrayList<Ticket>();
		for(TicketData t:response.getTicketDataList() ) {
			ticketList.add(TicketData2Ticket(t));
		}

		return ticketList;
	}

	@Override
	public Ticket getTicketById(int id) throws TicketException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket acceptTicket(int id) throws TicketException {
		// TODO Auto-generated method stub
		de.uniba.rz.io.rpc.updateTicket.Builder b = updateTicket.newBuilder();
		b.setID(id);
		b.setStatus(de.uniba.rz.io.rpc.updateTicket.Status.ACCEPTED);
		TicketData tdata = this.syncStub.updateTicketStatusService(b.build());
		return TicketData2Ticket(tdata);
	}

	@Override
	public Ticket rejectTicket(int id) throws TicketException {
		// TODO Auto-generated method stub
		de.uniba.rz.io.rpc.updateTicket.Builder b = updateTicket.newBuilder();
		b.setID(id);
		b.setStatus(de.uniba.rz.io.rpc.updateTicket.Status.REJECTED);
		TicketData tdata = this.syncStub.updateTicketStatusService(b.build());
		return TicketData2Ticket(tdata);
	}

	@Override
	public Ticket closeTicket(int id) throws TicketException {
		// TODO Auto-generated method stub
		de.uniba.rz.io.rpc.updateTicket.Builder b = updateTicket.newBuilder();
		b.setID(id);
		b.setStatus(de.uniba.rz.io.rpc.updateTicket.Status.CLOSED);
		TicketData tdata = this.syncStub.updateTicketStatusService(b.build());
		return TicketData2Ticket(tdata);
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


	private Ticket TicketData2Ticket(TicketData t) {
		Ticket ticket = new Ticket();
		ticket.setDescription(t.getDescription());
		ticket.setId(t.getId());
		ticket.setPriority(Priority.values()[t.getPriorityValue()]);
		ticket.setReporter(t.getReporter());
		ticket.setStatus(Status.values()[t.getStatusValue()]);
		ticket.setTopic(t.getTopic());
		ticket.setType(Type.values()[t.getTypeValue()]);

		return ticket;
	}

	class  AutoUpdateFields extends Thread{

		private final TicketServiceStub asycStub; 
		
		public AutoUpdateFields(TicketServiceStub asycStub) {
			
			this.asycStub=asycStub;
		}
		
		@Override
		public void run() {
			StreamObserver<AutoNewTicketRequest> client_observer = this.asycStub.streamNewTicket(new StreamObserver<GetAllTicketResponse>() {

				@Override
				public void onNext(GetAllTicketResponse response) {
					// TODO Auto-generated method stub
					System.out.println("Got Something");
					List<Ticket> ticketList = new ArrayList<Ticket>();
					for(TicketData t:response.getTicketDataList() ) {
						ticketList.add(TicketData2Ticket(t));
					}
					for(Ticket t: ticketList) {	
						System.out.println("Ticket Creater: " + t.getReporter());
					}
					Main.swing_controller.refreshTicketList();

				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					System.out.println("Error to retrive auto list from client end.");

				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Got the ticket list Autoupdate");

				}
			});

			client_observer.onNext(AutoNewTicketRequest.newBuilder().setMaxTicketId(0).build());
			
		}
		
		
		

	}

}
