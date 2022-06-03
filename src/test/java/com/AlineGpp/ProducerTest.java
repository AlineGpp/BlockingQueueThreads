package com.AlineGpp;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ArrayBlockingQueue;

import static org.junit.jupiter.api.Assertions.*;


/**
 * This is the test class that tests whether the generated numbers are between one and twelve and are positive.
 * @author AlineGpp
 */

class ProducerTest {

    private final ArrayBlockingQueue<Integer> QUEUE = new ArrayBlockingQueue<>(10);
    private final Producer PRODUCER = new Producer(QUEUE);

    @Test
    void shouldGeneratePositiveNumbers() {
        int numberProduced = PRODUCER.generateRandomNumber();
        assertTrue(numberProduced > 0);
    }

    @Test
    void shouldGenerateRandomNumberBetweenOneAndTwelve() {
        int numberProduced = PRODUCER.generateRandomNumber();
        assertTrue(numberProduced >= 1 && numberProduced <= 12);
    }


}