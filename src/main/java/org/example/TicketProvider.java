package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class TicketProvider {

    private final DataBase dataBase;
    private final PaymentProvider paymentProvider;


    public TicketProvider(DataBase dataBase, PaymentProvider paymentProvider) {
        this.dataBase = dataBase;
        this.paymentProvider = paymentProvider;
    }

    public Collection<Ticket> searchTicket(int clientId, Date date){
        Collection<Ticket> tickets = new ArrayList<>();
        for (Ticket ticket : dataBase.getTickets()){
            if (ticket.getCustomerId() == clientId && ticket.getDate().equals(date)){
                tickets.add(ticket);
            }
        }
        return tickets;
    }

    public boolean byTicket(int clientId, String cardNo){
        int orderId = dataBase.createTicketOrder(clientId);
        double amount = dataBase.getTicketAmount();

        return paymentProvider.buyTicket(orderId, cardNo, amount);
    }

    public  boolean checkTicket(String qrCode){
        for (Ticket ticket : dataBase.getTickets()){
            if (ticket.getQrcode().equals(qrCode)){
                ticket.setEnable(false);
                return true;
            }
        }
        return false;
    }

}
