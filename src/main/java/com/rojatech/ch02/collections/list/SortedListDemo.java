package com.rojatech.ch02.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("Z");
		list.add("N");
		list.add("S");
		list.add("G");
		
		Collections.sort(list);
		System.out.println(list);
		
		int result = Collections.binarySearch(list, "S");
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
        Collections.sort(stringList, String.CASE_INSENSITIVE_ORDER);

        // reverse order
        Collections.sort(stringList, Collections.reverseOrder());
        
        // Print the sorted list
        System.out.println("Sorted List (Case-Insensitive): " + stringList);
	}

}
