package de.uniba.rz.backend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import de.uniba.rz.entities.Priority;
import de.uniba.rz.entities.Status;
import de.uniba.rz.entities.Ticket;
import de.uniba.rz.entities.Type;

/**
 * This is a basic implementation of the <code>TicketStore</code> interface for testing purposes only.
 *
 * Caution: This class is neither thread-safe nor does it perform any checks in the updateTicketStatus method
 *
 * Do not use this class in the assignment solution but provide an own implementation of <code>TicketStore</code>!
 */
public class SimpleTicketStore implements TicketStore {

    private int nextTicketId = 0;

    private List<Ticket> ticketList = new ArrayList<>();

    private HashMap<Integer, Ticket> ticketHashMap= new HashMap<>();

    @Override
    public Ticket storeNewTicket(String reporter, String topic, String description, Type type, Priority priority) {
        System.out.println("Creating new Ticket from Reporter: "+reporter+" with the topic \""+topic+"\"");
        Ticket newTicket = new Ticket(nextTicketId++, reporter, topic, description, type, priority);
        ticketList.add(newTicket);
        return newTicket;
    }

    @Override
    public void updateTicketStatus(int ticketId, Status newStatus) {
        for(Ticket ticket : ticketList) {
            if (ticket.getId() == ticketId) {
                ticket.setStatus(newStatus);
            }
        }

        ticketHashMap.entrySet().stream().map(entry -> entry.getValue().clone()).collect(Collectors.toList());
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketList;
    }
}
