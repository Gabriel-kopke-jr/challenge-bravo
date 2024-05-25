package com.hurb.challenge.challengeresolve.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AwesomeApiClientsTest {

    private AwesomeApiClients underTest = new AwesomeApiClients();

    @Test
    void testIfObjectIsGive() throws JsonProcessingException {
        var result = underTest.fetchCurrency("USD", "BRL");

        assertNotNull(result);
    }

}