package com.AlineGpp;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * This is the main class that triggers two threads, one producing and the other consuming, in sync.
 * @author AlineGpp
 */

public class Main {
    public static void main(String[] args) {
        int capacity = 10;

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(capacity);
        Consumer consumer = new Consumer(queue);
        Producer producer = new Producer(queue);

        Thread consumerThread = new Thread(consumer);
        Thread producerThread = new Thread(producer);

        producerThread.start();
        consumerThread.start();

    }
}