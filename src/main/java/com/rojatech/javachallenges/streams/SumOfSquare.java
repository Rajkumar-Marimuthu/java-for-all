package com.rojatech.javachallenges.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfSquare {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(15,2,13,7,6,11,18);

        // sum of square of odd numbers
        int sum = numbers.stream().filter(elem -> (elem %2)==1 ).mapToInt(elem -> elem* elem).sum();
        System.out.println(sum);
    }
}
