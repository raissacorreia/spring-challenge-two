package com.challenge.hiringtest.adapters;

import com.challenge.hiringtest.adapters.AdapterBank1;
import com.challenge.hiringtest.adapters.AdapterBank2;
import com.challenge.hiringtest.adapters.IBank;

import java.util.ArrayList;

public class BankInitializer {

    public static ArrayList<IBank> getBanks() {
        ArrayList<IBank> banks = new ArrayList<IBank>();
        banks.add(new AdapterBank1());
        banks.add(new AdapterBank2());
        return banks;
    }
}