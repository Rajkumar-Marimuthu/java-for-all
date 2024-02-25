// Thread Priority
package com.rojatech.ch04.concurrency;

class Counter2 {
	int count;
	
	// only one thread can work at a time
	public synchronized void increment() {
		count++;
	}
}
public class SynchrnoizedDemo2 {

	public static void main(String[] args) {
		
		Counter2 c = new Counter2();
		
		Thread t1 = new Thread (() -> {
			for (int i=0; i<1000;i++) {
				c.increment();
			}
		},"ThreadOne");
		
		Thread t2 = new Thread (() -> {
			for (int i=0; i<1000;i++) {
				c.increment();
			}
		}, "ThreadTwo");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Count " + c.count);
	}

}
