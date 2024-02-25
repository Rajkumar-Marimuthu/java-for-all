package com.rojatech.javachallenges.others;

import java.util.Arrays;
import java.util.List;

public class Sum {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5);
		
		Integer sum = list.stream().reduce(0,Integer::sum);
		System.out.println(sum);
	}

}
