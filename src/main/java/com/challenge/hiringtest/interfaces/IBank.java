package com.challenge.hiringtest.interfaces;

import com.challenge.hiringtest.interfaces.*;

import java.util.List;
public interface IBank {
    public List<BankTransaction> getTransactions();
    public BankBalance getFullBalance();
}