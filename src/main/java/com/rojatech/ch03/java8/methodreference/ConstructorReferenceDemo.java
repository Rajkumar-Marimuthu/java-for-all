package com.rojatech.ch03.java8.methodreference;

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		MyInterface2 i2 = s -> new MyClass(s);
		i2.get("Using lambdas");
		
		MyInterface2 i3 = MyClass::new;
		i3.get("Using constructor mapping");
	}

}
