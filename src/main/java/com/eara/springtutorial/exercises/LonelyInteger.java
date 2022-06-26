package com.eara.springtutorial.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LonelyInteger {

    public static void main(String[] args) {
        System.out.println(lonelyinteger(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
    }

    /*
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        return a.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .min(Comparator.comparing(Map.Entry::getValue)).get().getKey();


    }
}
