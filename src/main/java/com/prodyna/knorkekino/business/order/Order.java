package com.prodyna.knorkekino.business.order;

import com.prodyna.knorkekino.business.customer.Customer;
import com.prodyna.knorkekino.business.ticket.Ticket;
import java.util.Set;

public class Order {

    public Customer customer;
    private Set<Ticket> tickets;

    public void addTickets(Set<Ticket> tickets) {
        this.tickets.addAll(tickets);
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }
}
