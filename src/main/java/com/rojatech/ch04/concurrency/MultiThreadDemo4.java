// using Lambda expression
package com.rojatech.ch04.concurrency;

public class MultiThreadDemo4 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		Thread t1 = new Thread(() -> {
			for (int i=0; i<5; i++) {
				System.out.println("Hi " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread( () -> {
			for (int i=0; i<5; i++) {
				System.out.println("hello " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time in milliseconds : " + (endTime - startTime));

	}

}