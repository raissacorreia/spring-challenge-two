package com.challenge.hiringtest.interfaces;

import com.challenge.hiringtest.adapters.*;
import com.bank1.integration.Bank1AccountSource;
import com.bank2.integration.Bank2AccountSource;

public class BankBalance {

    private double amount;
    private String currency;

    public BankBalance(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public BankBalance(int bankId) {
        if (bankId == 1) {
            AdapterBank1 adapterBank1 = new AdapterBank1(new Bank1AccountSource());
            this.setAmount(adapterBank1.getFullBalance().getAmount());
            this.setCurrency(adapterBank1.getFullBalance().getCurrency());
        } else if (bankId == 2) {
            AdapterBank2 adapterBank2 = new AdapterBank2(new Bank2AccountSource());
            this.setAmount(adapterBank2.getFullBalance().getAmount());
            this.setCurrency(adapterBank2.getFullBalance().getCurrency());
        }
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

    public void printBalance() {
        System.out.println("Balance: " + getAmount() + " " + getCurrency());
    }
}
