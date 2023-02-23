package com.challenge.hiringtest.bank;

import com.challenge.hiringtest.interfaces.BankTransactions;
import com.challenge.hiringtest.interfaces.BankBalance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class BankController {

    private BankTransactions bankTransactions;
    private BankBalance bankBalance;

    @GetMapping("/transactions")
    public void printTransactions() {
        bankTransactions = new BankTransactions(1);
        bankTransactions.printTransactions();
        bankTransactions = new BankTransactions(2);
        bankTransactions.printTransactions();
    }

    @GetMapping("/balances")
    public void printBalances() {
        bankBalance = new BankBalance(1);
        bankBalance.printBalance();
        bankBalance = new BankBalance(2);
        bankBalance.printBalance();
    }
}
