package com.rojatech.ch01.datatypes.string;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {

	public static void main(String[] args) {
		String str = "Hello how are you";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char c : str.toCharArray()) {
            map.merge(c, 1, Integer::sum);
		}
		System.out.println(map);

		Map<Character, Long> map1 = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map1);
	}
}
