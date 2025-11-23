package com.rojatech.ch03.java8.bifunction;

import java.util.function.BiFunction;

public class BiFunctionDemo1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        int sum = add.apply(5, 10);
        int product = multiply.apply(5, 10);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
