package com.rojatech.ch01.datatypes;

public class WrapperExample {

	public static void main(String[] args) {
		
		int x = 10;
		Integer xi = x; // auto boxing
		System.out.println(xi);
		
		int y = xi; // auto unboxing
		System.out.println(y);
		
		String str = Integer.toString(x);
		System.out.println("str : " + str);
		int z = Integer.parseInt(str);
		System.out.println(z);
		Integer si = Integer.valueOf(str);
		System.out.println(si);

		// int c = Integer.parseInt("C"); // throws exception. Arguments should be Decimal characters
		int c = Integer.parseInt("101");
		System.out.println(c);
	}

}
