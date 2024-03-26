package com.hurb.challenge.challengeresolve.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class HttpClientsTest {

    private HttpClients underTest = new HttpClients();

    @Test
    void testIfObjectIsGive() throws JsonProcessingException {
        var result = underTest.fetchCurrency("USD", "BRL");

        assertNotNull(result);
    }

}