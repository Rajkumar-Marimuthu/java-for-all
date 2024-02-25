package com.rojatech.ch03.java8.consumer;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// accepts single argument and returns no result
		// accept(), andThen()
		Consumer<Integer> squareMe = i -> System.out.println(i*i);
		Consumer<Integer> doubleIt = i -> System.out.println(i*2);
		squareMe.andThen(doubleIt).accept(5);
	}
}
