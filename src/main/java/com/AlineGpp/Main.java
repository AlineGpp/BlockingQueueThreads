package com.AlineGpp;

import java.util.concurrent.ArrayBlockingQueue;

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