package com.challenge.hiringtest.transactions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.challenge.hiringtest.models.BankTransactions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TransactionsTest {

  BankTransactions bankTransactions;

  @Test
  @DisplayName("Get Balance Bank 0")
  void testTransactionsBank1() {
    bankTransactions = new BankTransactions(0);
    assertEquals("Amount: 100.0, Type: Credit, Text: Check deposit", bankTransactions.printTransactions().get(0));

  }

  /*
  [
    "Amount: 100.0, Type: Credit, Text: Check deposit",
    "Amount: 25.5, Type: Debit, Text: Debit card purchase",
    "Amount: 225.0, Type: Debit, Text: Rent payment"
  ]
*/

  @Test
  @DisplayName("Get Balance Bank 1")
  void testTransactionsBank2() {
    bankTransactions = new BankTransactions(1);
    assertEquals("Amount: 125.0, Type: Debit, Text: Amazon.com", bankTransactions.printTransactions().get(0));
  }

    /*
  [
    "Amount: 125.0, Type: Debit, Text: Amazon.com",
    "Amount: 500.0, Type: Debit, Text: Car insurance",
    "Amount: 800.0, Type: Credit, Text: Salary"
]
*/
}
