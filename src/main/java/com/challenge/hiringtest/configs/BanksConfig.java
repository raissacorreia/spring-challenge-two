package com.challenge.hiringtest.configs;

import com.challenge.hiringtest.adapters.IBank;
import com.challenge.hiringtest.adapters.BankInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BanksConfig {
    @Bean
    public static ArrayList<IBank> banks() {
        return BankInitializer.getBanks();
    }
}
