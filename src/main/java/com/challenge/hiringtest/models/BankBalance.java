package com.challenge.hiringtest.models;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.challenge.hiringtest.adapters.AdapterBank1;
import com.challenge.hiringtest.adapters.AdapterBank2;
import com.challenge.hiringtest.adapters.IBank;

public class BankBalance {

    private double amount;
    private String currency;

    public BankBalance(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public BankBalance() {
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
