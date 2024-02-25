package com.rojatech.java11.optional;

import java.util.Optional;

public class OptionalUpdateDemo {

	public static void main(String[] args) {
		Optional<String> str = Optional.empty();
		System.out.println(str.isPresent());
		System.out.println(str.isEmpty());
		Optional<String> str2 = Optional.of("hello");
		System.out.println(str2.isPresent());
		System.out.println(str2.isEmpty());
	}

}
