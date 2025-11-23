// Using Thread class
package com.rojatech.ch04.concurrency;

class Hi2 extends Thread
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

class Hello2 extends Thread
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

public class MultiThreadDemo2 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Hi2 hi = new Hi2();
		Hello2 hello = new Hello2();
		hi.start();
		hello.start();
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time in milliseconds : " + (endTime - startTime));
	}
}
