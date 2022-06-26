package com.eara.springtutorial.exercises;

import java.util.Arrays;

public class TimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("01:40:03PM"));
    }

    /*
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        final int OFFSET = 12;
        String[] stringArr = s.split(":");
        String result = "";

        System.out.println(stringArr[2].substring(2));

        if (Integer.parseInt(stringArr[0]) == 12 &&
                stringArr[2].substring(2).equals("AM")) {
            result = String.format("0%d:%s:%s",
                    Integer.parseInt(stringArr[0]) - OFFSET,
                    stringArr[1],
                    stringArr[2].substring(0, 2));
        } else if (Integer.parseInt(stringArr[0]) == 12 &&
                stringArr[2].substring(2).equals("PM")) {
            result = String.format("%d:%s:%s",
                    Integer.parseInt(stringArr[0]),
                    stringArr[1],
                    stringArr[2].substring(0, 2));
        } else if (stringArr[2].substring(2).equals("AM")) {
            result = String.format("%s:%s:%s",
                    stringArr[0],
                    stringArr[1],
                    stringArr[2].substring(0, 2));
        } else if (stringArr[2].substring(2).equals("PM")) {
            result = String.format("%d:%s:%s",
                    Integer.parseInt(stringArr[0]) + OFFSET,
                    stringArr[1],
                    stringArr[2].substring(0, 2));
        }

        return result;
    }
}
