package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class DataBase {

    private static int counter;
    private Collection<Ticket> tickets = new ArrayList<>();
    private Collection<Customer> customers = new ArrayList<>();

    public DataBase() {
        tickets.add(new Ticket("code1", true));
        tickets.add(new Ticket("code2", true));
        tickets.add(new Ticket("code3", true));

    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    public double getTicketAmount(){
        return 45;
    }

    public int createTicketOrder(int clientId){

        return ++counter;
    }
}
