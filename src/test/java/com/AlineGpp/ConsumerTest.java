package com.AlineGpp;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ArrayBlockingQueue;

import static org.junit.jupiter.api.Assertions.*;


/**
 * This is the test class that tests whether each received number returns the correct station.
 * @author AlineGpp
 */
class ConsumerTest {
    private final ArrayBlockingQueue<Integer> QUEUE = new ArrayBlockingQueue<>(10);
    private final Consumer CONSUMER = new Consumer(QUEUE);

    @Test
    void shouldReturnWinter () {
        CONSUMER.setNumberConsumed(6);
        String seasonConverted = CONSUMER.convertNumberInSeasonsAndPrint();
        assertEquals("Inverno", seasonConverted);
    }

    @Test
    void shouldReturnSummer () {
        CONSUMER.setNumberConsumed(2);
        String seasonConverted = CONSUMER.convertNumberInSeasonsAndPrint();
        assertEquals("Verão", seasonConverted);
    }

    @Test
    void shouldReturnSpring () {
        CONSUMER.setNumberConsumed(11);
        String seasonConverted = CONSUMER.convertNumberInSeasonsAndPrint();
        assertEquals("Primavera", seasonConverted);
    }
    @Test
    void shouldReturnAutumn () {
        CONSUMER.setNumberConsumed(5);
        String seasonConverted = CONSUMER.convertNumberInSeasonsAndPrint();
        assertEquals("Outono", seasonConverted);
    }

    @Test
    void shouldReturnError() {
        CONSUMER.setNumberConsumed(23);
        String seasonConverted = CONSUMER.convertNumberInSeasonsAndPrint();
        assertEquals("Invalid number", seasonConverted);
    }



}