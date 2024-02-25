// Two threads interacting with help of wait() and notify()
package com.rojatech.ch04.concurrency;

/* 
 * wait() and notify() are methods provided by the Object class in Java, which allow threads to communicate and coordinate with each other in a multi-threaded environment. 
 * */

class Q2 {
	int num;
	boolean valueSet = false;
	
	public synchronized void put (int num) {
		
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.num = num;
		System.out.println("PUT " + num);
		valueSet = true;
		notify();
	}
	
	public synchronized void get() {
		while (!valueSet) {
			try {
				wait();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("GET " + num);
		valueSet=false;
		notify();
	}
}

class Producer2 implements Runnable {
	
	Q2 q;

	public Producer2(Q2 q) {
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
				Thread.sleep(500);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer2 implements Runnable {
	
	Q2 q;

	public Consumer2 (Q2 q) {
		this.q = q;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public void run() {
		while(true) {
			q.get();
			try {
				Thread.sleep(5000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class InterThreadDemo2 {
	public static void main(String[] args) {
		Q2 q = new Q2();
		new Producer2(q);
		new Consumer2(q);
	}
}
