package com.challenge.hiringtest.balance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.challenge.hiringtest.services.BalanceService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class BalanceTest {

  private final BalanceService balanceService = new BalanceService();

  @Test
  @DisplayName("Get Balance Bank 0")
  void testBalanceBank1() {
    assertEquals("Balance: 215.5 USD", balanceService.printBalance(0));
  }

  @Test
  @DisplayName("Get Balance Bank 1")
  void testBalanceBank2() {
    assertEquals("Balance: 512.5 USD", balanceService.printBalance(1));
  }
}
