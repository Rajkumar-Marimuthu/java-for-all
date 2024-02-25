package com.rojatech.ch01.oops;
class Foo2 {
	Object myMethod (String arg) {
		Object obj="FooObject";
		return obj;
	}
}

public class Bar2 extends Foo2 {
	
	String myMethod (String arg) {
		String obj="BarString";
		return obj;
	}

	String myMethod (Object arg) {
		String obj="helo";
		return obj;
	}
	
	public static void main(String[] args) {
		Foo2 foo2 = new Bar2();
		String obj1 = "he";
		System.out.println(foo2.myMethod(obj1));
		
	}

}
