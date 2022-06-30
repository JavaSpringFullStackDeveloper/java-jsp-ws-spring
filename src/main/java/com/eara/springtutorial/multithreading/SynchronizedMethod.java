package com.eara.springtutorial.multithreading;

public class SynchronizedMethod {

    public static void main(String[] args) {
        Brackets brackets1 = new Brackets();
        Brackets brackets2 = new Brackets();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    brackets1.generate();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    brackets2.generate();
                }
            }
        }).start();
    }
}

class Brackets {

    synchronized public void generate() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i <= 5) {
                System.out.print("[");
            } else {
                System.out.print("]");
            }
        }

        System.out.println();

        for (int j = 0; j <= 1 ; j++) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
