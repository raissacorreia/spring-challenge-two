package com.challenge.hiringtest.interfaces;

import com.challenge.hiringtest.adapters.*;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import com.challenge.hiringtest.interfaces.IBank;

public class BankTransactions {

    private List<BankTransaction> bankRecord;
    @Autowired
    ArrayList<IBank> banks = new ArrayList<IBank>();

    public BankTransactions(int bankId) {
        banks.add(new AdapterBank1());
        banks.add(new AdapterBank2());
        this.setBankRecord(banks.get(bankId).getTransactions());
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
