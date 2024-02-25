package com.rojatech.ch03.java8.streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByDemo {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("hello","how","are","you","where","are","you");
		
		Map<String, Long> counted = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(counted);

	}

}
