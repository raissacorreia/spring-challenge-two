package com.challenge.hiringtest.interfaces;

import com.challenge.hiringtest.adapters.*;

import java.util.List;

public class BankTransactions {

    private List<BankTransaction> bankRecord;

    public BankTransactions(int bankId) {
        if (bankId == 1) {
            AdapterBank1 adapterBank1 = new AdapterBank1();
            this.setBankRecord(adapterBank1.getTransactions());
        } else if (bankId == 2) {
            AdapterBank2 adapterBank2 = new AdapterBank2();
            this.setBankRecord(adapterBank2.getTransactions());
        }
    }

    public List<BankTransaction> getBankRecord() {
        return this.bankRecord;
    }

    public void setBankRecord(List<BankTransaction> bankRecord) {
        this.bankRecord = bankRecord;
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
}
