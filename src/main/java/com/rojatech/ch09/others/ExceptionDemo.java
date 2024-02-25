package com.rojatech.ch09.others;

public class ExceptionDemo {

	public static void main(String[] args) {
		int i, j, k;
		i = 8;
		j = 0;
		try {
			k = i/j; // ArithmeticException
		}
		catch (Exception e) {
			System.out.println("Cannot divide by zero");
			e.printStackTrace();
		} finally {
			System.out.println("Software Program execution inside finally block");
			try {
				System.out.println(8/0);
			} catch (Exception e) {
				System.out.println("Cannot divide by zero");
				e.printStackTrace();
			}
			
		}
		System.out.println("Software Program execution completed");
	}

}
