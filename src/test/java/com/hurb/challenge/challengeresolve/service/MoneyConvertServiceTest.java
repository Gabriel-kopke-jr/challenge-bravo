package com.hurb.challenge.challengeresolve.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoneyConvertServiceTest {

    private MoneyConvertService underTest = new MoneyConvertService();

    @Test
    void testConversionCurrencyWhenTwoCurrencyAreGivenOk(){
        BigDecimal testValue = BigDecimal.valueOf(500);
        BigDecimal result = underTest.convertCurrency("BRL","USD",testValue);
        BigDecimal expected = BigDecimal.valueOf(2500);
        Assertions.assertEquals(result.compareTo(expected),0);
    }

}