package org.example;

public class CustomerProvider {

    private DataBase dataBase;


    public CustomerProvider(DataBase dataBase) {
        this.dataBase = dataBase;
    }


    public Customer getCustomer(String login, String password){

        return new Customer();
    }
}
