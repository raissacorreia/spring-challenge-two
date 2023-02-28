package com.challenge.hiringtest.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.challenge.hiringtest.adapters.AdapterBank1;
import com.challenge.hiringtest.adapters.AdapterBank2;
import com.challenge.hiringtest.adapters.IBank;
import com.challenge.hiringtest.models.BankBalance;

@Service
public class BalanceService {

    private final ArrayList<IBank> banks = new ArrayList<IBank>();

    public BalanceService() {
        banks.add(new AdapterBank1());
        banks.add(new AdapterBank2());
    }

    public String printBalance(int id) {
        return "Balance: " + banks.get(id).getFullBalance().getAmount() + " " + banks.get(id).getFullBalance().getCurrency();
    }
}