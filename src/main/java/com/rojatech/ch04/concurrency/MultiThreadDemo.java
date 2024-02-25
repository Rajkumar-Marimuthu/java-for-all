// without multi threading
package com.rojatech.ch04.concurrency;

class Hi
{
	public void show() {
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

class Hello
{
	public void show() {
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
public class MultiThreadDemo {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Hi hi = new Hi();
		Hello hello = new Hello();
		hi.show();
		hello.show();
		long endTime = System.currentTimeMillis();
		System.out.println("Execution time in milliseconds : " + (endTime - startTime));
	}
}
