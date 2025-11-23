package com.rojatech.ch04.concurrency;

public class MyRunnable implements Runnable {

	int sum;

	@Override
	public void run() {
		System.out.println("Child thread sum calculation: ");
		synchronized(this) {
			for (int i=1; i<=100; i++) {
				sum += i;
			}
			this.notify();
		}
	}
}
