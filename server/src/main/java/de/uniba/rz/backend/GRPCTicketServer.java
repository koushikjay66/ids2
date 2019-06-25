package de.uniba.rz.backend;

import java.io.IOException;

import com.sun.xml.ws.api.server.ServiceDefinition;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;

public class GRPCTicketServer implements RemoteAccess {

	private final int port;
	private final Server server;

	public GRPCTicketServer(String port ) {
		// TODO Auto-generated constructor stub
		System.out.println(port);
		this.port=Integer.parseInt(port);
		this.server=ServerBuilder.forPort(Integer.parseInt(port)).addService(new TicketService()).build();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void prepareStartup(TicketStore ticketStore) {
		// TODO Auto-generated method stub
		try {
			
			this.server.start();
			System.out.println("Successfully Started server at port :"+ this.server.getPort());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		if(!this.server.isShutdown()) {
			
			try {
				this.server.shutdown().awaitTermination();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.err.println("Error in shutting down server");
				//e.printStackTrace();
			}
		}

	}

}
