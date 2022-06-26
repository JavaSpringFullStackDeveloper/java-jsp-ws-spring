package com.eara.springtutorial.multithreading;

public class SynchronizationUnderConcurrencyControl {

    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    SynchronizationUnderConcurrencyControl.counter++;
                }
                System.out.println("The loop in thread1 is over");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    SynchronizationUnderConcurrencyControl.counter++;
                }
                System.out.println("The loop in thread2 is over");
            }
        });

        thread1.start();
        thread2.start();
        Thread.sleep(2000);
        System.out.println(String.format("SynchronizationUnderConcurrencyControl counter: %d",
                SynchronizationUnderConcurrencyControl.counter));
    }
}
