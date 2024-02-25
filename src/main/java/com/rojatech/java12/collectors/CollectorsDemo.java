package com.rojatech.java12.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {

	public static void main(String[] args) {
		Result result = Stream.of(5,10,8,20,7,15,18).collect(Collectors.teeing(Collectors.counting(), 
				Collectors.filtering(n->(Integer)n>10, Collectors.toList()), Result::new));
		System.out.println(result);
	}

}
