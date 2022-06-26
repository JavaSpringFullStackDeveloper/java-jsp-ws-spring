package com.eara.springtutorial.multithreading;

public class MultiThreadApp {

    public static void main(String[] args) throws InterruptedException {
        MyCounter myCounter1 = new MyCounter(1);
        MyCounter myCounter2 = new MyCounter(2);

        long startTime = System.currentTimeMillis();
        myCounter1.start();
        System.out.println("*************************");
        myCounter2.start();
        Thread.sleep(5000);
        long endTime = System.currentTimeMillis();

        System.out.println(String.format("Total time required to process: %d",
                endTime - startTime));
    }
}

class MyCounter extends Thread {
    private int threadNumber;

    public MyCounter(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void countMe() {
        for (int i = 1; i <= 9 ; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("The value of i is: %d and the htread number is: %d",
                    i, threadNumber));
        }
    }

    @Override
    public void run() {
        countMe();
    }
}
