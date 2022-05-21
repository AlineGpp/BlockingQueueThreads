package com.AlineGpp;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Consumer is a class that consumes the messages from the queue and prints them.
 * @author AlineGpp
 */

public class Consumer implements Runnable {

    private ArrayBlockingQueue<Integer> queue;
    private Integer numberConsumed;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
        this.numberConsumed =0;
    }

    public ArrayBlockingQueue<Integer> getQueue() {
        return queue;
    }

    public Integer getNumberConsumed() {
        return numberConsumed;
    }

    public void setNumberConsumed(Integer textConsumed) {
        this.numberConsumed = textConsumed;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (!getQueue().isEmpty()) {
                    setNumberConsumed(getQueue().take());
                    convertNumberInSeasonsAndPrint();
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void convertNumberInSeasonsAndPrint() {
        if (getNumberConsumed() >= 6 && getNumberConsumed() <=9) {
            System.out.println("Inverno");
        } else if (getNumberConsumed() >= 10 && getNumberConsumed() <=12) {
            System.out.println("Primavera");
        } else if (getNumberConsumed() >= 1 && getNumberConsumed() <=3) {
            System.out.println("Verao");
        } else if (getNumberConsumed() >= 4 || getNumberConsumed() <=5) {
            System.out.println("Outono");
        }
    }

}
