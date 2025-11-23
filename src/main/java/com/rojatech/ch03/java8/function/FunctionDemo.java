package com.rojatech.ch03.java8.function;
import java.util.function.Function;


public class FunctionDemo {

	public static void main(String[] args) {
		// apply()
		// andThen()
		// compose()
		// identity()
		Function<Integer, Integer> squareMe = i -> i*i;
		System.out.println(squareMe.apply(5));

		Function<Integer, Integer> doubleIt = i -> i*2;
		System.out.println(squareMe.andThen(doubleIt).apply(5));

		Integer result1 = squareMe.andThen(doubleIt).apply(5);
		System.out.println(result1);

		Integer result2 = squareMe.compose(doubleIt).apply(5);
		System.out.println(result2);

		System.out.println(Function.identity().apply(5));

	}

}
