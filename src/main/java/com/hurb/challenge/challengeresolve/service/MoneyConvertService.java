package com.hurb.challenge.challengeresolve.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public class MoneyConvertService {

    public BigDecimal convertCurrency(String originCurrency, String finalCurrency, BigDecimal amount){
         BigDecimal mockedExchangeTax = BigDecimal.valueOf(5.00);
         return mockedExchangeTax.multiply(amount);
    }
}
