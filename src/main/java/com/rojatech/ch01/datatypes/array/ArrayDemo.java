package com.rojatech.ch01.datatypes.array;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        // Primitive Array declaration
        int[] intArray2 = new int[]{4, 5, 8, 2, 1, 3};
        //System.out.println(Arrays.toString(intArray2)); // [4, 5, 8, 2, 1, 3]

        // enhanced for loop can also be used to iterate over the elements of an array.
        for (int i : intArray2) {
            System.out.println(i);
        }

        // Object Array declaration
        Integer[] intArray = new Integer[]{4, 5, 8, 2, 1, 3};
        System.out.println(Arrays.toString(intArray)); // [4, 5, 8, 2, 1, 3]

        // you can convert an object array (not primitive types) to a List using Arrays.asList()
        // Returns a fixed-size list backed by the specified array.
        // Changes made to the array will be visible in the returned list,
        // and changes made to the list will be visible in the array.
        Arrays.asList(intArray).forEach(System.out::println);

        // if you need to perform operations like filtering, mapping, or reducing on the array elements.
        // Use Arrays.stream() - for both primitive and object type arrays.
        Arrays.stream(intArray).forEach(System.out::println);
    }
}
