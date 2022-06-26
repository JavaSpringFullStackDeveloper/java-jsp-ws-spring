package com.eara.springtutorial.exercises;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(15);
    }

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        IntStream.rangeClosed(1, n).forEach(value -> {
            if ((value % 3 == 0) && (value % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (value % 3 == 0) {
                System.out.println("Fizz");
            } else if (value % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(value);
            }
        });
    }
}
