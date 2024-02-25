// Two threads interacting
package com.rojatech.ch04.concurrency;

// Queue
class Q {
	int num;
	
	public void put (int num) {
		this.num = num;
		System.out.println("PUT " + num);
	}
	
	public void get() {
		System.out.println("GET " + num);
	}
}

class Producer implements Runnable {
	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while(true) {
			q.put(i++);
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	Q q;

	public Consumer (Q q) {
		this.q = q;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public void run() {
		while(true) {
			q.get();
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class InterThreadDemo {

	public static void main(String[] args) {
		
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}
