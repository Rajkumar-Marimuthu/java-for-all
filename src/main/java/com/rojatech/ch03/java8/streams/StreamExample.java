package com.rojatech.ch03.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		String[] names = {"Pichai", "Elon", "Mike", "Amit", "Mary", "Laila", "Sairam"};
		
		// Create stream based on array
		Arrays.stream(names).forEach(name -> System.out.println(name));
		
		// min()
		Optional<String> min = Arrays.stream(names).min((a,b) -> a.compareTo(b));
		System.out.println("min: " + min.get());
		
		List<String> nameList = new ArrayList<>(Arrays.asList(names));
		//List<String> nameList = Arrays.asList(names);
		
		// Create stream based on list
		boolean res = nameList.stream().allMatch(name -> !name.isEmpty());
		System.out.println(res);
		
		// Create stream using generate method
		//System.out.println("generated stream");
		//Stream<Integer> generatedStream = Stream.generate(()->5); // This will run for ever
		//generatedStream.forEach(n->System.out.println(n)); 
		
		// create stream using iterate method
		//System.out.println("iterated stream:");
		//Stream<Integer> iteratedStream = Stream.iterate(1,x-> x+5); // This will run for ever
		//iteratedStream.forEach(n->System.out.println(n));
		
		List<Integer> intList = Arrays.asList(4,3,7,4,2,1,9);		
		System.out.println("Sum = " + intList.stream().reduce(0, (a,b)-> a+b));
		
		// flatMap
		String[][] names2d = {names, names};
		String[] names1d = Stream.of(names2d)
				.flatMap(arr -> Stream.of(arr))
				.peek(n -> System.out.println("peek " + n))
				.toArray(size -> new String[size]);
	}
}