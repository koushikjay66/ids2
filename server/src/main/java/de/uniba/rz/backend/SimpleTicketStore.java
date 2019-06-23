package de.uniba.rz.backend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import de.uniba.rz.entities.Priority;
import de.uniba.rz.entities.Status;
import de.uniba.rz.entities.Ticket;
import de.uniba.rz.entities.Type;

/**
 * This is a basic implementation of the <code>TicketStore</code> interface for
 * testing purposes only.
 *
 * Caution: This class is neither thread-safe nor does it perform any checks in
 * the updateTicketStatus method
 *
 * Do not use this class in the assignment solution but provide an own
 * implementation of <code>TicketStore</code>!
 */
public class SimpleTicketStore implements TicketStore {

	private static HashMap<Integer, Ticket> TicketDump = new HashMap<Integer, Ticket>();
	
	private int nextTicketId = 0;
	private List<Ticket> ticketList = new ArrayList<>();
	private static AtomicInteger TicketID = new AtomicInteger();

	@Override
	public Ticket storeNewTicket(String reporter, String topic, String description, Type type, Priority priority) {
		System.out.println("Creating new Ticket from Reporter: " + reporter + " with the topic \"" + topic + "\"");
		Ticket newTicket = new Ticket(nextTicketId++, reporter, topic, description, type, priority);
		ticketList.add(newTicket);
		return newTicket;
	}

	@Override
	public void updateTicketStatus(int ticketId, Status newStatus) {
		for (Ticket ticket : ticketList) {
			if (ticket.getId() == ticketId) {
				ticket.setStatus(newStatus);
			}
		}
	}

	
	/*
	 * Synchronized method to get All Tickets. used this "synchronized" keyword so this is thread safe. Atleast from stack overflow!! 
	 */
	public static synchronized List<Ticket> getTickets(){
		
		return new ArrayList<Ticket>(TicketDump.values());
	}
	

	public static synchronized Ticket CreateTicket(String reporter, String topic , Status status , String description , Type type , Priority priority) {
		int id = TicketID.getAndIncrement();
		Ticket t = new Ticket();
		t.setId(id);
		t.setReporter(reporter);
		t.setTopic(topic);
		t.setStatus(status);
		t.setDescription(description);
		t.setType(type);
		t.setPriority(priority);
		SimpleTicketStore.TicketDump.put(id, t);
		return t;
	}

	
	public static synchronized Ticket UpdateStatus(int id , Status status) {
		Ticket t =TicketDump.get(id);

		if(t!=null) {
			t.setStatus(status);
		}
		return t;
	}
	@Override
	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
