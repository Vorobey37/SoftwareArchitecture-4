package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Customer {

    private static int counter;
    private final int id;
    private Collection<Ticket> tickets = new ArrayList<>();




    {
        id = ++counter;
    }




    public int getId() {
        return id;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void addTickets(){
        String qrcode = String.valueOf(new Random().ints());
        tickets.add(new Ticket(qrcode, true));
    }
}
