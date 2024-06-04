package com.rojatech.javachallenges.others;

import java.util.Arrays;
import java.util.List;

public class FindMinDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,1,6,7);
		System.out.println(list.stream().mapToInt(m->m).min().getAsInt());
	}

}
