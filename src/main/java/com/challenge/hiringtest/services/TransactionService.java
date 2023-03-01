package com.challenge.hiringtest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.challenge.hiringtest.adapters.AdapterBank1;
import com.challenge.hiringtest.adapters.AdapterBank2;
import com.challenge.hiringtest.adapters.IBank;
import com.challenge.hiringtest.models.BankTransaction;

@Service
public class TransactionService {

    private ArrayList<IBank> banks;

    public TransactionService(ArrayList<IBank> banks) {
        this.banks = banks;
    }

    public String getWrittenTransaction(BankTransaction transaction) {
        return "Amount: " + transaction.getAmount() +
                ", Type: " + transaction.getWrittenType() +
                ", Text: " + transaction.getText();
    }

    public List<String> getTransactions(int bankId) {
        return banks.get(bankId).getTransactions().stream().map(t -> getWrittenTransaction(t))
                .collect(Collectors.toList());
    }
}
