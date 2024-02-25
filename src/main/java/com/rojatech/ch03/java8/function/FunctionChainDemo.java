package com.rojatech.ch03.java8.function;
import java.util.function.Function;

public class FunctionChainDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> doubleIt = i -> 2*i;
		Function<Integer, Integer> cubeMe = i -> i*i*i;
		
		System.out.println(doubleIt.andThen(cubeMe).apply(2));
		System.out.println(doubleIt.compose(cubeMe).apply(2));
	}

}
