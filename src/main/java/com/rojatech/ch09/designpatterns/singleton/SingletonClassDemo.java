package com.rojatech.ch09.designpatterns.singleton;

public class SingletonClassDemo {

	public static void main(String[] args) {
		SingletonClass instance1 = SingletonClass.getInstance();
		SingletonClass instance2 = SingletonClass.getInstance();
		System.out.println(instance1 == instance2);
		instance1.displayMessage();
		instance2.displayMessage();
	}
}
