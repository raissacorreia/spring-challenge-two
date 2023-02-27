package com.challenge.hiringtest.bank;

import com.challenge.hiringtest.models.BankTransactions;
import com.challenge.hiringtest.models.BankBalance;
import com.challenge.hiringtest.payloads.BankIdDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("")
public class BankController {

    @GetMapping("/transactions")
    public ResponseEntity<List<String>> printTransactions(
            @RequestBody BankIdDto bankIdDto
    )
    {
        int id = bankIdDto.getId();
        BankTransactions bankTransactions = new BankTransactions(id);
        return ResponseEntity.ok(bankTransactions.printTransactions());
    }

    @GetMapping("/balances")
    public ResponseEntity<String> printBalances(
            @RequestBody BankIdDto bankIdDto
    )
    {
        int id = bankIdDto.getId();
        BankBalance bankBalance = new BankBalance(id);
        return ResponseEntity.ok(bankBalance.printBalance());
    }
}
