package com.rojatech.ch01.datatypes.arraysutil;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        // The Arrays class provides a toString() method that can be used to print the contents of an array.
        // This method is particularly useful for one-dimensional arrays.
        System.out.println(Arrays.toString(numbers));

        String[] array = new String[5]; // String array initialization with null
        System.out.println(array); // [Ljava.lang.String;@123a439b

        // Print String array
        System.out.println(Arrays.toString(array)); // [null, null, null, null, null]

        //Fill array
        Arrays.fill(array, "hello");
        System.out.println(Arrays.toString(array)); // [hello, hello, hello, hello, hello]

    }
}
