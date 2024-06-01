package com.rojatech.ch02.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListDemoP1 {

	public static void main(String[] args) {

		// The ArrayList class has a regular array inside it.
		// When an element is added, it is placed into the array.
		// If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

		List<Integer> values1 = new ArrayList<>();
		// Note: Java collections can only be used with Object types, not primitive types.
		// Here, int is a primitive type, so it is autoboxed to Integer.
		values1.add(3);
		values1.add(10);
		values1.add(8);
		values1.add(1, 5);
		
		// Print List
		System.out.println(values1); // [3, 5, 10, 8]
		
		// access to random element in the list
		System.out.println(values1.get(2)); // 10
		
		// remove from list
		values1.remove(0);
		System.out.println(values1); // [5, 10, 8]

		// Sort ArrayList
		Collections.sort(values1);
		System.out.println(values1); // [5, 8, 10]

		// replace
		values1.set(2,15); 
		System.out.println(values1); // [5, 8, 15]
		
		// clear list
		values1.clear();
		System.out.println(values1); // []
		
		// List of Integer definition
		List<Integer> intList = Arrays.asList(5, 23, 21); // Ordered collection
		System.out.println(intList); // [5, 23, 21]
		
		values1.addAll(intList);
		System.out.println(values1); // [5, 23, 21]
		
		if (values1.contains(21))
			System.out.println(true);

		values1.forEach(System.out::println);

		// List of String definition
		List<String> words = Arrays.asList("Hello", "how", "are");
		System.out.println(words); // [Hello, how, are]

		// When To Use
		// Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
		
		// Collections.sort()
		Collections.sort(words);
		System.out.println(words); // [Hello, are, how, you?]
		
		// You cant modify the list created from array. java.lang.UnsupportedOperationException
		/* Iterator<String> it = words.iterator();
		while (it.hasNext()) {
			String w = it.next();
			if (w.equals("Hello")) {
				it.remove();
			}
		} */
		
		List<String> cities = new ArrayList<String>();
		cities.add("London");
		cities.add("Frankfurt");
		cities.add("Rome");
		cities.add("Paris");
		cities.add("Zurich");
		cities.add("Amsterdam");
		
		Iterator<String> it = cities.iterator();
		while (it.hasNext()) {
			String w = it.next();
			if (w.equals("Rome")) { 
				//cities.remove(w);   // removing element directly from collection throw java.util.ConcurrentModificationException
				it.remove(); // remove using iterator will work fine.
			}
		}
		
		System.out.println("After removal, cities :" + cities); // [London, Frankfurt, Paris]
		
		// ArrayList of Object
		List<Object> values = new ArrayList<Object>();
		values.add(3);
		values.add("Naveen");
		System.out.println(values); // [3, Naveen]
		
		List<String> cities1 = new CopyOnWriteArrayList<String>();
		cities1.add("London");
		cities1.add("Frankfurt");
		cities1.add("Rome");
		cities1.add("Paris");
		cities1.add("Zurich");
		cities1.add("Amsterdam");
		
		Iterator<String> it1 = cities1.iterator();
		while (it1.hasNext()) {
			String w = it1.next();
			if (w.equals("Rome")) { 
				cities1.remove(w);   // removing element directly from collection works fine
			}
		}
		
		System.out.println("After removal, cities :" + cities); // [London, Frankfurt, Paris]
	}
}