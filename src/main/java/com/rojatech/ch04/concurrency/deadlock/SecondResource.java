package com.rojatech.ch04.concurrency.deadlock;

public class SecondResource {

	public synchronized void method1(FirstResource fr) {
		System.out.println("Inside method1 of SR:");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking method1 of FR");
		fr.method2();
	}
	
	public synchronized void method2() {
		System.out.println("Inside method2 of SR:");
	}
}

