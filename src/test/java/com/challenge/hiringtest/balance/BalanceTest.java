package com.challenge.hiringtest.balance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.challenge.hiringtest.models.BankBalance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class BalanceTest {

  BankBalance bankBalance;

  @Test
  @DisplayName("Get Balance Bank 0")
  void testBalanceBank1() {
    bankBalance = new BankBalance(0);
    assertEquals("Balance: 215.5 USD", bankBalance.printBalance());
  }

  @Test
  @DisplayName("Get Balance Bank 1")
  void testBalanceBank2() {
    bankBalance = new BankBalance(1);
    assertEquals("Balance: 512.5 USD", bankBalance.printBalance());
  }
}
