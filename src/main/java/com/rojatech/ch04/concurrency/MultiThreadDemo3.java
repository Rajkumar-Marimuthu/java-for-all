// Using Runnable interface
package com.rojatech.ch04.concurrency;

class Hi3 implements Runnable
{
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("Hi " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello3 implements Runnable
{
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("hello " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadDemo3 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Hi3 hi = new Hi3();
		Hello3 hello = new Hello3();
		
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(hello);
		
		t1.start();
		t2.start();
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time in milliseconds : " + (endTime - startTime));


	}

}
