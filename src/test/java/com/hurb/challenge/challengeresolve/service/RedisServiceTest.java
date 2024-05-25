package com.hurb.challenge.challengeresolve.service;

import com.hurb.challenge.challengeresolve.model.AwesomeApi;
import org.junit.jupiter.api.Test;

class RedisServiceTest {

    RedisService underTest = new RedisService();

    @Test
    void testIncludeInCluster() {
        underTest.includeInCluster(new AwesomeApi());
    }

}