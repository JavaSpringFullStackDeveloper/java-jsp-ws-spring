package com.eara.springtutorial.multithreading;

import java.util.Random;

public class MultiThreadApp {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyCounter(1));
        Thread thread2 = new Thread(new MyCounter(2));

        thread1.start();
        thread2.start();
    }
}

class MyCounter implements Runnable {
    private int threadNumber;

    public MyCounter(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 1; i <= 9 ; i++) {
            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("The value of i is: %d and the htread number is: %d",
                    i, threadNumber));
        }
    }
}
