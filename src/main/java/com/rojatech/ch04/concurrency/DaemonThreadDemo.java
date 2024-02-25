package com.rojatech.ch04.concurrency;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		System.out.println("in main thread");
		Thread myThread = new Thread(()->{
			for (int i=0;i<10;i++) {
				System.out.println(i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		//myThread.setDaemon(true); // daemon thread - main thread doesn't wait for daemon thread completion
		myThread.setDaemon(false); // user thread
		System.out.println("Start Daemon Thread");
		myThread.start();
		System.out.println("Main thread end..");
	}
}
