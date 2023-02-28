package com.challenge.hiringtest.models;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.challenge.hiringtest.adapters.AdapterBank1;
import com.challenge.hiringtest.adapters.AdapterBank2;
import com.challenge.hiringtest.adapters.IBank;

public class BankBalance {

    private double amount;
    private String currency;

    @Autowired
    ArrayList<IBank> banks = new ArrayList<IBank>();

    public BankBalance(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public BankBalance(int bankId) {
        banks.add(new AdapterBank1());
        banks.add(new AdapterBank2());
        this.setAmount(banks.get(bankId).getFullBalance().getAmount());
        this.setCurrency(banks.get(bankId).getFullBalance().getCurrency());
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

    public String printBalance() {
        return "Balance: " + getAmount() + " " + getCurrency();
    }
}
