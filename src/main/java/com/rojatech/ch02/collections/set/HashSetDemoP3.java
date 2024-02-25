package com.rojatech.ch02.collections.set;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemoP3 {

	public static void main(String[] args) {
		// no duplicate elements. 
		// no order		
		Set<String> names = new HashSet<String>();
		names.add("Java");
		names.add("Angular");
		names.add("Spring");
		names.add("Hibernate");
		
		// Printing Set
		System.out.println(names);
		
		// Accessing element
		names.forEach(v->System.out.println(v));
		
	}

}
