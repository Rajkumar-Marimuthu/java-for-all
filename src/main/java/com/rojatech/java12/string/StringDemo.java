package com.rojatech.java12.string;

public class StringDemo {

	public static void main(String[] args) {

		String str = "  All the power is within you!";
		System.out.println(str);
		System.out.println(str.indent(1));
		System.out.println(str.indent(3));
		System.out.println(str.indent(5));
		System.out.println(str.indent(-1));
		System.out.println(str.indent(-3));
		System.out.println(str.indent(-5));
		
		String s1 = "10";
		Integer si = s1.transform(Integer::parseInt);
		System.out.println(si);
	}

}
