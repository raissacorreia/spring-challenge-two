package com.challenge.hiringtest.bank;

import com.challenge.hiringtest.models.BankTransactions;
import com.challenge.hiringtest.models.BankBalance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("")
public class BankController {

    @GetMapping("/transactions")
    public ResponseEntity<List<String>> printTransactions(
            @RequestParam(value = "bankId", defaultValue = "0", required = false) int id
    )
    {
        BankTransactions bankTransactions = new BankTransactions(id);
        return ResponseEntity.ok(bankTransactions.printTransactions());
    }

    @GetMapping("/balances")
    public ResponseEntity<String> printBalances(
            @RequestParam(value = "bankId", defaultValue = "0", required = false) int id
    )
    {
        BankBalance bankBalance = new BankBalance(id);
        return ResponseEntity.ok(bankBalance.printBalance());
    }
}
