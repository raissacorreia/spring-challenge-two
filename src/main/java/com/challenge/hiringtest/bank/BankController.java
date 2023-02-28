package com.challenge.hiringtest.bank;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.hiringtest.payloads.BankIdDto;
import com.challenge.hiringtest.services.BalanceService;
import com.challenge.hiringtest.services.TransactionService;

@RestController
@RequestMapping("")
public class BankController {

    private TransactionService transactionService;
    private BalanceService balanceService;

    public BankController(TransactionService transactionService, BalanceService balanceService) {
        this.transactionService = transactionService;
        this.balanceService = balanceService;
    }

    @GetMapping("/transactions")
    public ResponseEntity<?> printTransactions(
            @RequestBody BankIdDto bankIdDto) {
        int id = bankIdDto.getId();

        try {
            if (id > 1 || id < 0) {
                return ResponseEntity.badRequest().body("Bank id must be 0 or 1");
            } else {
                return ResponseEntity.ok(transactionService.getTransactions(id));
            }
        } catch (Exception e) {
            return ResponseEntity.ok("Error: " + e.getMessage());
        }
    }

    @GetMapping("/balances")
    public ResponseEntity<?> printBalances(
            @RequestBody BankIdDto bankIdDto) {
        int id = bankIdDto.getId();
        try {
            if (id > 1 || id < 0) {
                return ResponseEntity.badRequest().body("Bank id must be 0 or 1");
            } else {
                return ResponseEntity.ok(balanceService.printBalance(id));
            }
        } catch (Exception e) {
            return ResponseEntity.ok("Error: " + e.getMessage());
        }
    }
}
