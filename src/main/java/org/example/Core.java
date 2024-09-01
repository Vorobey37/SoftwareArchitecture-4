package org.example;

public class Core {
    private final CustomerProvider customerProvider;
    private final TicketProvider ticketProvider;
    private final DataBase dataBase;
    private  final PaymentProvider paymentProvider;


    public Core() {
        dataBase =  new DataBase();
        customerProvider = new CustomerProvider(dataBase);
        paymentProvider = new PaymentProvider();
        ticketProvider = new TicketProvider(dataBase, paymentProvider);

    }

    public TicketProvider getTicketProvider() {
        return ticketProvider;
    }

    public CustomerProvider getCustomerProvider() {
        return customerProvider;
    }

    public DataBase getDataBase() {
        return dataBase;
    }
}
