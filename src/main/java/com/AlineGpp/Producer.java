package com.AlineGpp;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Producer is a class that creates a thread that will add elements to the
 * queue.
 * @author AlineGpp
 */

public class Producer implements Runnable {

    private ArrayBlockingQueue<Integer> queue;
    private int numberProduced;

    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
        this.numberProduced = 0;
    }

    public ArrayBlockingQueue<Integer> getQueue() {
        return queue;
    }

    public Integer getNumberProduced() {
        return numberProduced;
    }

    public void setNumberProduced(Integer numberProduced) {
        this.numberProduced = numberProduced;
    }

    @Override
    public void run() {
        while (true) {
            while (getQueue().remainingCapacity() > 0) {
                setNumberProduced(generateRandomNumber());
                try {
                    getQueue().put(getNumberProduced());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Generates a random number to be added to the queue.
     */

    public Integer generateRandomNumber() {
        return (int) (Math.random() * 12 + 1);
    }
}
