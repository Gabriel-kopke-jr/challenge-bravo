package com.hurb.challenge.challengeresolve.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("api/convert")
public class Controller {

    @GetMapping
    private void convertCurrency(
        @RequestParam("from") String originCurrency,
        @RequestParam("to") String finalCurrency,
        @RequestParam("amount") BigDecimal amountMoney
        ){

        System.out.println("ok sir");

    }
}

