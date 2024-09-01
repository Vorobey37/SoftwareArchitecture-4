package org.example;

import java.util.Date;

public class Ticket {

    private static int id;
    private int customerId;
    private Date date;
    private String qrcode;
    private boolean enable = true;

    static {
        id++;
    }

    public Ticket(String qrcode, boolean enable) {
        this.qrcode = qrcode;
        this.enable = enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getDate() {
        return date;
    }

    public String getQrcode() {
        return qrcode;
    }

    public boolean isEnable() {
        return enable;
    }
}
