package com.rojatech.javachallenges.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindPairs {
	public static void main(String[] args) {
		// Difference between List.of and Arrays.asList()

		// create a fixed-size list backed by the specified array
		// list is modifiable, allowing you to only update its elements and not its structure.
		// The list is backed by the original array, so any changes to elements of the list will affect the underlying array and vice versa.
		// the size of the list is fixed, preventing structural modifications such as adding or removing elements.
		// allows null elements
		List<String> strList1 = Arrays.asList("1", "2", "3", "4");
		strList1.set(0, "5");
		//strList1.add("6"); // UnsupportedOperationException
		System.out.println(strList1);

		// creates an immutable list containing the specified elements
		// immutable, meaning its size and elements cannot be modified after creation.
		// list has a fixed size and does not support adding or removing elements.
		// does not allow null elements.
		// This method is ideal when you need an immutable list with a fixed set of elements.
		// It ensures data integrity and prevents accidental modifications.
		List<String> strList = List.of("1", "2", "3", "4");
		//strList.set(0, "5"); // UnsupportedOperationException
		//strList.add("6"); // UnsupportedOperationException
		strList.forEach(e -> System.out.println(e+"abc"));
		
		strList.stream().filter(e -> {
			return Integer.parseInt(e) % 2 == 0 ; // returns primitive int.
			//return Integer.valueOf(e) % 2 == 0 ; // returns Integer.
		}).forEach(System.out::println);
	}
}
