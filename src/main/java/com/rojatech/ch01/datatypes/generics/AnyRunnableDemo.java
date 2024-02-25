package com.rojatech.ch01.datatypes.generics;

public class AnyRunnableDemo {

	public static void main(String[] args) {
		//AnyRunnable<Thread> ar = new AnyRunnable<>();
		AnyRunnable<MyClass> ar = new AnyRunnable<>();
		//AnyRunnable<String> ar = new AnyRunnable<>();
	}

}
