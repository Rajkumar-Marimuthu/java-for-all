// we have defined a functional interface FunctionalInterfaceDemo and 
//referring a static method to it's functional method singleAbstractMethod().
package com.rojatech.ch03.java8.methodreference;

interface FunctionalInterfaceDemo {
	void singleAbstractMethod();
}
public class MethodReferenceDemo4 {
	
	public static void main (String[] args) {
		FunctionalInterfaceDemo fid = Test::testImplementation2;
		fid.singleAbstractMethod();	
	}
}

class Test {
	public static void testImplementation() {
		System.out.println("This is test implementation of abstract method");
	}
	
	public static void testImplementation2() {
		System.out.println("This is test implementation of abstract method2");
	}
	
}