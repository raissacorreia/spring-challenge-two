package com.challenge.hiringtest.transactions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.challenge.hiringtest.services.TransactionService;
import com.challenge.hiringtest.adapters.IBank;
import com.challenge.hiringtest.adapters.BankInitializer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class TransactionsTest {
  @Autowired
  private BankInitializer bankInitializer;

  private ArrayList<IBank> banks = bankInitializer.getBanks();

  private final TransactionService transactionService = new TransactionService(banks);

  @Test
  @DisplayName("Get Balance Bank 0")
  void testTransactionsBank1() {
    assertEquals("Amount: 100.0, Type: Credit, Text: Check deposit", transactionService.getTransactions(0).get(0));

  }

  @Test
  @DisplayName("Get Balance Bank 1")
  void testTransactionsBank2() {
    assertEquals("Amount: 125.0, Type: Debit, Text: Amazon.com", transactionService.getTransactions(1).get(0));
  }
}
