package com.challenge.hiringtest.interfaces;

import com.challenge.hiringtest.adapters.*;
import com.bank1.integration.Bank1AccountSource;
import com.bank2.integration.Bank2AccountSource;

import java.util.List;

public class BankTransactions {

    private List<BankTransaction> bankRecord;
    private BankBalance fullBalance;

    public BankTransactions(int bankId) {
        if (bankId == 1) {
            AdapterBank1 adapterBank1 = new AdapterBank1(new Bank1AccountSource());
            this.setBankRecord(adapterBank1.getTransactions());
            this.setFullBalance(adapterBank1.getFullBalance());
        } else if (bankId == 2) {
            AdapterBank2 adapterBank2 = new AdapterBank2(new Bank2AccountSource());
            this.setBankRecord(adapterBank2.getTransactions());
            this.setFullBalance(adapterBank2.getFullBalance());
        }
    }

    public List<BankTransaction> getBankRecord() {
        return this.bankRecord;
    }

    public BankBalance getFullBalance() {
        return this.fullBalance;
    }

    public void setBankRecord(List<BankTransaction> bankRecord) {
        this.bankRecord = bankRecord;
    }

    public void setFullBalance(BankBalance fullBalance) {
        this.fullBalance = fullBalance;
    }

    public void printTransactions() {
            getBankRecord().stream().forEach(t -> {
                String message =
                        "Amount: " + t.getAmount() +
                        ", Type: " + t.getWrittenType() +
                        ", Text: "+ t.getText();
                System.out.println(message);
            });

    }

    public void printBalance() {
        System.out.println("Balance: " +
                getFullBalance().getAmount() + " " +
                getFullBalance().getCurrency()
        );
    }
}
