// base class
package com.rojatech.ch01.oops;

class Base {
	protected String myField = "base";
	protected static Object myMethod() {
		return "Foo2";
	}
}

// child class
public class Extended extends Base {
	
	public String myField = "exteneded";
	/*
	 * public String myMethod() { return "Bar"; }
	 */

	public static void main(String[] args) {
		
		Base base = new Extended();
		Extended extended = new Extended();
		
		System.out.println(base.myField);
		System.out.println(Base.myMethod());
		
		System.out.println(extended.myField);
		System.out.println(extended.myMethod());
	}

}
