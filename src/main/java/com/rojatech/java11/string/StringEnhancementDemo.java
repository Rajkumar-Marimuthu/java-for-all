package com.rojatech.java11.string;

import java.util.stream.Collectors;

public class StringEnhancementDemo {

	public static void main(String[] args) {
		var str = "                ";
		var str1 = "";
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		System.out.println(str1.isBlank());
		System.out.println(str1.isEmpty());
		
		var str2 = "hello\nhow\nare\nyou today?";
		System.out.println(str2);
		System.out.println(str2.lines().collect(Collectors.toList()));
		
		char c = '\u0020';
		System.out.println(c);
		str2 = c + str2;
		System.out.println(str2.strip());
		System.out.println(str2.stripLeading());
		System.out.println(str2.stripTrailing());
		System.out.println("!".repeat(50));
	}

}
