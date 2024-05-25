package com.hurb.challenge.challengeresolve.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
public class RedisClient {
    @Bean
    public Jedis redisConfig() {
        return new Jedis("localhost", 6379);
    }
}
