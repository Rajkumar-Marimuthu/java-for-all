package com.rojatech.java09.immutablecollection;

import java.util.List;
import java.util.Set;

public class ImmutableCollectionDemo {

	public static void main(String[] args) {
		List<String> list = List.of("abc", "xyz", "123");
		//list.add("nyc"); // java.lang.UnsupportedOperationException
		System.out.println(list);
		
		//Set<String> set = Set.of("abc", "abc"); // java.lang.IllegalArgumentException: duplicate element: abc
		Set<String> set = Set.of("abc", "xyz");
		// set.add("123"); // java.lang.UnsupportedOperationException
		System.out.println(set);
		
		
	}

}
