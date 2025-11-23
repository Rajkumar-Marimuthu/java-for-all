// Synchronized method and synchronized block example
package com.rojatech.ch04.concurrency;

class Counter {
	int count;

	// only one thread can work at a time
	public  void increment() {
		// synchronized block
		synchronized (this) {
			count++;
		}
	}
	// alternative way to declare synchronized method
	/*public synchronized void increment() {
		count++;
	}*/
}
public class SynchronizedDemo1 {

	public static void main(String[] args) {
		System.out.println("Synchronized Demo");
		System.out.println("=================");
		final long startTime = System.currentTimeMillis();

		Counter c = new Counter();
		
		Thread t1 = new Thread (() -> {
			for (int i=0; i<1000;i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                c.increment();
			}
		});
		
		Thread t2 = new Thread (() -> {
			for (int i=0; i<1000;i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
				c.increment();
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		final long endTime = System.currentTimeMillis();
		System.out.println("Total time taken " + (endTime - startTime) + " ms");
		System.out.println("Count " + c.count);
	}

}
