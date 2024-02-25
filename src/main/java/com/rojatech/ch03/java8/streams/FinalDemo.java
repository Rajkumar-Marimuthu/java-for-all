package com.rojatech.ch03.java8.streams;

public class FinalDemo {
	
	static final int a=23;
	static final int b=0;
	static int c=5;
	int d=7;
	
	void check() {
		System.out.println(c);
	}
	
	static void check1() {
		// Cannot make a static reference to the non-static field d
		// System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		FinalDemo fd = new FinalDemo();
		fd.check();

	}

}
