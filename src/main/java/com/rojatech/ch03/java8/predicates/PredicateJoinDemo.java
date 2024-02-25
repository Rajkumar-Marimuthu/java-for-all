package com.rojatech.ch03.java8.predicates;

import java.util.function.Predicate;

public class PredicateJoinDemo {

	public static void main(String[] args) {

		int[] x = {3,7,4,6,10,12,16,15,18,20};
		
		Predicate<Integer> pr1 = i -> i > 10;
		Predicate<Integer> pr2 = i -> i % 2 == 0;
		
		System.out.println("Numbers greater than 10 and even");
		m1(pr1.and(pr2),x);
		
	}

	static public void m1(Predicate<Integer> p, int[] x) {
		for (int i : x) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
}
