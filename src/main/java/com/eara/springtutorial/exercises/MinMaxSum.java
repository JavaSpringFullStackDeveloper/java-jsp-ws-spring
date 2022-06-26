package com.eara.springtutorial.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxSum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        MinMaxSum.miniMaxSum(arr);

        bufferedReader.close();
    }

    public static void miniMaxSum(List<Integer> arr) {
        // 942381765 627450398 954173620 583762094 236817490
        long minimumVal = arr.stream()
                .sorted(Comparator.reverseOrder())
                .mapToLong(v -> v)
                .skip(1)
                .reduce(0L, Long::sum);

        long maximumVal = arr.stream()
                .mapToLong(v -> v)
                .sorted()
                .skip(1)
                .reduce(0L, Long::sum);

        System.out.println(String.format("%d %d", minimumVal, maximumVal));
    }
}
