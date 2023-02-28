package com.challenge.hiringtest.models;

import com.challenge.hiringtest.adapters.*;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import com.challenge.hiringtest.adapters.IBank;

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

    public List<String> printTransactions() {
        return getBankRecord().stream().map(t -> getWrittenTransaction(t)).collect(Collectors.toList());
    }

    public String getWrittenTransaction(BankTransaction transaction) {
        return "Amount: " + transaction.getAmount() +
                ", Type: " + transaction.getWrittenType() +
                ", Text: "+ transaction.getText();
    }
}
