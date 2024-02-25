package com.rojatech.ch09.others;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateDemo {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("hello","value","header","header","value");
		Set<String> set = new HashSet<String>();
		
		List<String> dup = strList.stream().filter(str -> !set.add(str)).collect(Collectors.toList());
		System.out.println(dup);
		
		List<Integer> intList = Arrays.asList(5,6,8,9,23,45,12);
		Integer max = intList.stream().max(Integer :: compare).get();
		System.out.println(max);
		List<Integer> sortedList = intList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList);
	}

}
