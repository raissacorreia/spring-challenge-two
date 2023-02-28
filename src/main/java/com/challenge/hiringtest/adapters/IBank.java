package com.challenge.hiringtest.adapters;

import java.util.List;

import com.challenge.hiringtest.models.BankTransaction;
import com.challenge.hiringtest.models.BankBalance;

public interface IBank {
    public abstract List<BankTransaction> getTransactions();
    public abstract BankBalance getFullBalance();
}