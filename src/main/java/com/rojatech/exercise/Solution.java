package com.rojatech.exercise;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public static String run (int input) {

        String result = "";
        int startDigit = input ==1 ? 1: (int) Math.pow(10, input - 1) + 1;
        int endDigit = (int) Math.pow(10, input) -1;
        result = IntStream.range(startDigit, endDigit + 1)
                .filter(num -> {
                    System.out.println(num);
                    String numStr = Integer.toString(num);
                    var leadingZerosPresent = numStr.contains("0");
                    if (leadingZerosPresent) {
                        return false;
                    } else {
                        return isAllDigitsInAscendingOrder(numStr);
                    }
                })
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(","));

        return result;
    }

    public static void main(String[] args) {
        System.out.println(run(1));
    }

    private static boolean isAllDigitsInAscendingOrder(String s) {
        System.out.println(s);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
