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
    public ResponseEntity<?> printTransactions(
            @RequestBody BankIdDto bankIdDto
    )
    {
    int id = bankIdDto.getId();

    try {
        if (id > 1 || id < 0) {
            return ResponseEntity.badRequest().body("Bank id must be 0 or 1");
        } else {
            BankTransactions bankTransactions = new BankTransactions(id);
            return ResponseEntity.ok(bankTransactions.printTransactions());
        }
    } catch (Exception e) {
        return ResponseEntity.ok("Error: " + e.getMessage());
    }
    }

    @GetMapping("/balances")
    public ResponseEntity<?> printBalances(
            @RequestBody BankIdDto bankIdDto
    )
    {
        int id = bankIdDto.getId();
        try {
            if (id > 1 || id < 0) {
                return ResponseEntity.badRequest().body("Bank id must be 0 or 1");
            } else {
                BankBalance bankBalance = new BankBalance(id);
                return ResponseEntity.ok(bankBalance.printBalance());
            }
        } catch (Exception e) {
            return ResponseEntity.ok("Error: " + e.getMessage());
        }
    }
}
