package com.eara.springtutorial.plusminus;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PlusMinus {

    public static void main(String[] args) {
        plusMinus(Arrays.asList(1, 1, 0, -1, -1));
    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        DecimalFormat df = new DecimalFormat("0.000000");

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (Integer value: arr) {
            if (value == 0) {
                zeroCount++;
            } else if (value > 0) {
                positiveCount++;
            } else if (value < 0) {
                negativeCount++;
            }
        }

        System.out.println(df.format(positiveCount/(double)arr.size()));
        System.out.println(df.format(negativeCount/(double)arr.size()));
        System.out.println(df.format(zeroCount/(double)arr.size()));

    }
}
