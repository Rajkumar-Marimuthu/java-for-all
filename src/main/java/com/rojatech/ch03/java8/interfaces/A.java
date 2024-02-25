package com.rojatech.ch03.java8.interfaces;

public interface A {
	
	default void m1() {
		System.out.println("inside m1() A");
	}

}
