package com.rojatech.ch02.collections.map;

public class User {

	@Override
	public String toString() {
		return "User";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method is called");
	}
}
