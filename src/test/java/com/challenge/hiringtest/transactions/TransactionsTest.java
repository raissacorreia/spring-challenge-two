package com.challenge.hiringtest.transactions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.challenge.hiringtest.services.TransactionService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TransactionsTest {

  private final TransactionService transactionService = new TransactionService();

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
