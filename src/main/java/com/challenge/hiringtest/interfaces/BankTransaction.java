package com.challenge.hiringtest.interfaces;

public class BankTransaction {

    private double amount;
    private int type;
    private String text;

    public BankTransaction(double amount, int type, String text) {
        this.amount = amount;
        this.type = type;
        this.text = text;
    }

    public double getAmount() {
        return amount;
    }

    public int getType() {
        return type;
    }

    public String getText() {
        return text;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setText(String text) {
        this.text = text;
    }
}
