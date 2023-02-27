package com.challenge.hiringtest.bank;

import com.challenge.hiringtest.models.BankTransactions;
import com.challenge.hiringtest.models.BankBalance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("")
public class BankController {

    @GetMapping("/transactions")
    public void printTransactions(@RequestParam(value = "bankId", defaultValue = "0", required = false) int id) {
        BankTransactions bankTransactions = new BankTransactions(id);
        bankTransactions.printTransactions().forEach(System.out::println);
    }

    @GetMapping("/balances")
    public void printBalances(@RequestParam(value = "bankId", defaultValue = "0", required = false) int id) {
        BankBalance bankBalance = new BankBalance(id);
        System.out.println(bankBalance.printBalance());
    }
}
