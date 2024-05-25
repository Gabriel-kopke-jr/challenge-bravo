package com.hurb.challenge.challengeresolve.service;

import com.hurb.challenge.challengeresolve.client.RedisClient;
import com.hurb.challenge.challengeresolve.model.AwesomeApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;


@Service
public class RedisService {
    @Autowired
    private RedisClient redisClient;

    public void includeInCluster(AwesomeApi awesomeApi) {
        Jedis jedis = redisClient.redisConfig();
        jedis.set(awesomeApi.generateKey(), awesomeApi.generateValueKey().toString());
        jedis.set(awesomeApi.generateInvertedKey(), awesomeApi.generateValueInvertedKey().toString());
    }

    public Boolean checkKey(String key) {
        Jedis jedis = redisClient.redisConfig();
        return jedis.exists(key);
    }

    public String getTax(String key) {
        Jedis jedis = redisClient.redisConfig();
        return jedis.get(key);
    }
}
