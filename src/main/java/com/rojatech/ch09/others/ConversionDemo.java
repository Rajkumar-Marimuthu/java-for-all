package com.rojatech.ch09.others;

public class ConversionDemo {

	public static void main(String[] args) {
		
		int n = 10;
		
		String s = String.valueOf(n);
		
		 if (n == Integer.parseInt(s)) {
			 System.out.println("conversion successful!");
		 }
		
	}
}
