package com.rojatech.javachallenges.others;

import java.util.stream.IntStream;

public class FactorialDemo {

	public static void main(String[] args) {
		int num = 5;
		System.out.println(IntStream.rangeClosed(2, num).reduce(1, (a, b) -> a*b));
	}
}
