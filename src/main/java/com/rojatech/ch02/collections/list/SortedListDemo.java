package com.rojatech.ch02.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedListDemo {

	public static void main(String[] args) {
		List<String> alphabetList = new ArrayList<String>();
		
		alphabetList.add("A");
		alphabetList.add("Z");
		alphabetList.add("N");
		alphabetList.add("S");
		alphabetList.add("G");
		
		Collections.sort(alphabetList);
		System.out.println(alphabetList);
		
		int result = Collections.binarySearch(alphabetList, "S");
		System.out.println(result);
		
		// Create a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("orange");
        stringList.add("Banana");
        stringList.add("Grapes");
        stringList.add("kiwi");

        // Print the unsorted list
        System.out.println("Unsorted List: " + stringList);

        // Sort the list of strings in a case-insensitive manner
        stringList.sort(String.CASE_INSENSITIVE_ORDER);

        // reverse order
        stringList.sort(Collections.reverseOrder());
        
        // Print the sorted list
        System.out.println("Sorted List (Case-Insensitive): " + stringList);
	}
}
