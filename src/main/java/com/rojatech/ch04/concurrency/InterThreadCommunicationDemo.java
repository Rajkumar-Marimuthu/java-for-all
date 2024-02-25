package com.rojatech.ch04.concurrency;

public class InterThreadCommunicationDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread mtt = new Thread(mt);
		mtt.start();
		synchronized(mt) {
			try {
				mt.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
		}
		System.out.println(mt.sum);
	}
}
