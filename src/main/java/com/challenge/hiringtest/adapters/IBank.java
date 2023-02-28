package com.challenge.hiringtest.adapters;

import java.util.List;

import com.challenge.hiringtest.models.BankBalance;
import com.challenge.hiringtest.models.BankTransaction;

public interface IBank {
    public abstract List<BankTransaction> getTransactions();

    public abstract BankBalance getFullBalance();
}