package com.rojatech.java09.stremapienhancement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIEnhancementDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,50,13,15,28, null);
		//List<Integer> filtered = list.stream().filter(n -> (n%5==0)).collect(Collectors.toList());
		//System.out.println(filtered); // [10, 50, 15]
		
		List<Integer> taken = list.stream().takeWhile(n -> (n%5==0)).collect(Collectors.toList());
		System.out.println(taken); // [10, 50]
		
		List<Integer> dropped = list.stream().dropWhile(n -> (n%5==0)).collect(Collectors.toList());
		System.out.println(dropped); // [13, 15, 28, nul]
		
		System.out.println(list.stream().flatMap(Stream::ofNullable).collect(Collectors.toList()));
		
	}

}
