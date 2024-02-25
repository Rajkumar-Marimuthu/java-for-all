package com.rojatech.ch03.java8.optional;
import lombok.Data;

import java.util.List;
import java.util.Optional;

record User(String name) {
}

public class OptionalDemo {

	public static void main(String[] args) {

		Optional<User> newUser1 = Optional.empty();

		System.out.println(newUser1.orElse(new User("Maike"))); // User [name=Maike]
		System.out.println(newUser1.orElseGet(() -> new User("Maike"))); // User [name=Maike]
		//System.out.println(newUser1.orElseThrow(() -> new NullPointerException("No Element")));

		List<String> fruits = List.of("apple", "banana", "mango", "berry");
		Optional<String> matched = fruits.stream().filter(fruit -> fruit.startsWith("b")).findFirst();
		matched.ifPresent(System.out::println); // banana
		
		Optional<String> matched1 = fruits.stream().filter(fruit -> fruit.startsWith("s")).findFirst();
		matched1.ifPresent(System.out::println); // No output
	}
}
