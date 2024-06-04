package com.rojatech.javachallenges.others;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByDemo {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("apple", "banana", "mango", "orange", "gua", "apple", "pappaya", "apple", "orange", "jackfruit");
		
		Map<String, Long> res = fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(res);
		
		Map<String, Long> finalMap = new LinkedHashMap<String, Long>();
		
		res.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed())
		.forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
		
		System.out.println(finalMap);
	}

}
