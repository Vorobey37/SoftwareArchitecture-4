package org.example;

import java.util.Collection;
import java.util.Date;

public class MobileApp {

    private final Customer customer;
    private final TicketProvider ticketProvider;
    private final CustomerProvider customerProvider;


    public MobileApp(TicketProvider ticketProvider, CustomerProvider customerProvider) {
        this.ticketProvider = ticketProvider;
        this.customerProvider = customerProvider;
        customer = customerProvider.getCustomer("login", "password");
    }

    public Collection<Ticket> getTickets(){
        return customer.getTickets();
    }

    public void searchTicket(Date date){

        customer.setTickets(ticketProvider.searchTicket(customer.getId(), new Date()));
    }

    public boolean buyTicket(String cardNo){
        customer.addTickets();
        return ticketProvider.byTicket(customer.getId(), cardNo);
    }
}
