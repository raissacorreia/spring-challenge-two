package com.challenge.hiringtest.adapters;

import com.challenge.hiringtest.interfaces.BankTransaction;
import com.challenge.hiringtest.interfaces.BankBalance;

import com.bank1.integration.Bank1AccountSource;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdapterBank1 {

    private Bank1AccountSource bank1;

    public AdapterBank1() {
        this.bank1 = new Bank1AccountSource();
    }

    public List<BankTransaction> getTransactions() {
        List<BankTransaction> transactionList = bank1.getTransactions(1, null, null).stream().map(
                transaction -> {
                    return new BankTransaction(
                            transaction.getAmount(),
                            transaction.getType(),
                            transaction.getText()
                    );
        }).collect(Collectors.toList());
        return transactionList;
   }

    public BankBalance getFullBalance() {
        double balance = bank1.getAccountBalance(1);
        String currency = bank1.getAccountCurrency(1);
        return new BankBalance(balance, currency);
    }
}
