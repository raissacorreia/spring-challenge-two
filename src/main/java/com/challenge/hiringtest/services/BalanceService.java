package com.challenge.hiringtest.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.challenge.hiringtest.adapters.AdapterBank1;
import com.challenge.hiringtest.adapters.AdapterBank2;
import com.challenge.hiringtest.adapters.IBank;
import com.challenge.hiringtest.models.BankBalance;

@Service
public class BalanceService {

    private ArrayList<IBank> banks;

    public BalanceService(ArrayList<IBank> banks) {
        this.banks = banks;
    }

    public String printBalance(int id) {
        return "Balance: " + banks.get(id).getFullBalance().getAmount() + " " + banks.get(id).getFullBalance().getCurrency();
    }
}