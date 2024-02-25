package com.rojatech.ch05.exceptions;

public class MyThreadException extends Exception {

	MyThreadException() {
		super();
	}
	
	MyThreadException(String message) {
		super(message);
	}

	MyThreadException(String message, Throwable cause) {
		super(message, cause);
	}
}
