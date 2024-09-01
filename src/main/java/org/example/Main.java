package org.example;

import java.util.Collection;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Core core = new Core();
        MobileApp mobileApp = new MobileApp(core.getTicketProvider(), core.getCustomerProvider());
        BusStation busStation = new BusStation(core.getTicketProvider());


        if (mobileApp.buyTicket("124578986532")){
            System.out.println("Клиент успешно купил билет");
            mobileApp.searchTicket(new Date());
            Collection<Ticket> tickets = mobileApp.getTickets();
            if (busStation.checkTicket(tickets.stream().findFirst().get().getQrcode())){
                System.out.println("Клиент успешно прошел в автобус");
            }
        }
    }
}