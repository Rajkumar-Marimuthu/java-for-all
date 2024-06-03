package com.rojatech.ch01.datatypes;

public class WrapperExample {

	public static void main(String[] args) {
		
		int x = 10;
		Integer xi = x; // auto boxing
		System.out.println(xi);
		
		int y = xi; // auto unboxing
		System.out.println(y);
		
		String str = Integer.toString(x);
		System.out.println("str : " + str); // str : 10
		int z = Integer.parseInt(str); // returns primitive int
		System.out.println(z); // 10
		Integer si = Integer.valueOf(str); // returns Integer object
		System.out.println(si); // 10

		// int c = Integer.parseInt("C"); // throws exception. Arguments should be Decimal characters
		int c = Integer.parseInt("101");
		System.out.println(c); // 101
	}

}
