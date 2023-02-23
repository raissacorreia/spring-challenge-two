package com.challenge.hiringtest.adapters;

import com.challenge.hiringtest.interfaces.BankTransaction;
import com.challenge.hiringtest.interfaces.BankBalance;

import com.bank2.integration.Bank2AccountSource;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdapterBank2 {

    private Bank2AccountSource bank2;

    public AdapterBank2() {
        this.bank2 = new Bank2AccountSource();
    }

    public List<BankTransaction> getTransactions() {
        List<BankTransaction> transactionList = bank2.getTransactions(1, null, null).stream().map(
                transaction -> {
                    double amount = transaction.getAmount();
                    int type = transaction.getType()
                            .toString().equals("DEBIT") ? 2 : 1;
                    String text = transaction.getText();

                    return new BankTransaction(amount, type, text);
        }).collect(Collectors.toList());
        return transactionList;
    }

    public BankBalance getFullBalance() {
        double balance = bank2.getBalance(1).getBalance();
        String currency = bank2.getBalance(1).getCurrency();
        return new BankBalance(balance, currency);
    }
}
