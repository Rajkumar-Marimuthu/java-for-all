package com.rojatech.ch02.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		Random random = new Random();
		
		for (int i=0; i<10; i++) {
			list.add(random.nextInt(20));
		}
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
		
	}

}
