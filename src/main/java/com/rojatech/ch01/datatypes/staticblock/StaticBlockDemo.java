package com.rojatech.ch01.datatypes.staticblock;

public class StaticBlockDemo {
	static int a = 10;
	final int b = 10;
	StaticBlockDemo() {
		a = 5; 
		System.out.println("constructor, a = " + StaticBlockDemo.a);
	}

	// Non-static block executed before constructor.
	// Non-static block gets executed every time when the object is instantiated.
	{
		System.out.println("not static block a = " + a);
	}

	public static void display() {
		//System.out.println("in display ", b); // Cannot make a static reference to the non-static field b
	}
	public static void main(String[] args) {
		System.out.println("in main");
		StaticBlockDemo sb = new StaticBlockDemo();
		System.out.println(a);
	}

	// code inside the static block is executed only once:
	// the first time the class is loaded into memory, even before main methods.
	static {
		System.out.println("in static block");
	}
}
