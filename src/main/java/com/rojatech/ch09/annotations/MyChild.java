package com.rojatech.ch09.annotations;

public class MyChild extends MyParent {
	@Override
	public String greet(String name) {
		return "Hello " + name;
	}

}
