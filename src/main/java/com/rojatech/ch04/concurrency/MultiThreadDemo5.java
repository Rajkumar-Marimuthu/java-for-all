// main thread execution wait for child thread to completion
package com.rojatech.ch04.concurrency;

public class MultiThreadDemo5 {

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
		try {
			/*
			 * the join() method is used to make a calling thread wait for a specified thread to complete its execution. 
			 * It's a way to ensure that the calling thread doesn't proceed until the specified thread has finished its work.
			 */
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time in milliseconds : " + (endTime - startTime));
	}
}