package com.rojatech.java09.trywithresource;

public class MyWorker implements AutoCloseable {

	
	public MyWorker() {
		System.out.println("Creating the resource");
	}

	public void doSomething() {
		System.out.println("Doing something");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Closing the resource");
	}

}
