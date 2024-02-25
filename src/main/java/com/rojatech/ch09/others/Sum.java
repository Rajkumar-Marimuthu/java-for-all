package com.rojatech.ch09.others;
import java.util.Arrays;
import java.util.List;

public class Sum {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Integer sum = list.stream().reduce(0,Integer::sum);
		System.out.println(sum);

	}

}
