package com.challenge.hiringtest.balance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.challenge.hiringtest.services.BalanceService;
import com.challenge.hiringtest.adapters.IBank;
import com.challenge.hiringtest.adapters.BankInitializer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class BalanceTest {

  @Autowired
  private BankInitializer bankInitializer;

  private ArrayList<IBank> banks = bankInitializer.getBanks();

  private final BalanceService balanceService = new BalanceService(banks);

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
