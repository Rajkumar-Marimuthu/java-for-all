package com.rojatech.ch09.others;

public class LambdaScope {

	public static void main(String[] args) {
		double n = 5;
		//n = 8;
		//Calculator c = (a,b) -> a+b+n;
		Calculator c = (a,b) -> a+b;
		System.out.println(c.calc(5, 2));
	}

}

@FunctionalInterface
interface Calculator {
	double calc (double a, double b);
}