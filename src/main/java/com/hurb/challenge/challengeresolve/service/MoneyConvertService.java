package com.hurb.challenge.challengeresolve.service;

import com.hurb.challenge.challengeresolve.model.AwesomeApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public class MoneyConvertService {
    @Autowired
    private RedisService redisService;
    @Autowired
    private AwesomeApiService awesomeApiService;
    public BigDecimal convertCurrency(String originCurrency, String finalCurrency, BigDecimal amount){
        String key = originCurrency + "-" + finalCurrency;
        Boolean isInCluster = redisService.checkKey(key);
        if (isInCluster) {
            BigDecimal tax = BigDecimal.valueOf(Float.parseFloat(redisService.getTax(key)));
            BigDecimal finalAmount = amount.multiply(tax);
            return finalAmount;
        }
        AwesomeApi awesomeApi = awesomeApiService.fetchCurrency(originCurrency, finalCurrency);
        redisService.includeInCluster(awesomeApi);
        return awesomeApi.generateValueKey();
    }

}
