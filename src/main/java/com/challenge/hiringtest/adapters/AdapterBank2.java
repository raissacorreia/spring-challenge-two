package com.challenge.hiringtest.adapters;

import java.util.List;
import java.util.stream.Collectors;

import com.bank2.integration.Bank2AccountSource;
import com.challenge.hiringtest.models.BankBalance;
import com.challenge.hiringtest.models.BankTransaction;

public class AdapterBank2 implements IBank {

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
