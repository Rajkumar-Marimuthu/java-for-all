package com.rojatech.ch02.collections.set;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		Random random = new Random();
		
		for (int i=0; i<10; i++) {
			list.add(random.nextInt(20));
		}
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>(list); // does not maintain order
		System.out.println(set);

		Set<Integer> lset = new LinkedHashSet<>(list); // maintains insertion order
		System.out.println(lset);
		
	}

}
