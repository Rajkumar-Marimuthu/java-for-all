package com.rojatech.ch03.java8.streams;

import java.util.function.Consumer;
import java.util.function.Function;

public class AdderImpl implements Adder {

	@Override
	public String add(Function<String, String> f) {
		System.out.println("add F");
		return f.apply("Welcome ");
	}

	@Override
	public void add(Consumer<Integer> f) {
	}
	
	public static void main (String[] args) {
		AdderImpl adderImpl = new AdderImpl();
		String r = adderImpl.add(a -> a + "lambda");
		System.out.println(r);
	}
	
}