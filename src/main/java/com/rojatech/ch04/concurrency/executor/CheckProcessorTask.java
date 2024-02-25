package com.rojatech.ch04.concurrency.executor;

public class CheckProcessorTask implements Runnable {

	String name;
	
	public CheckProcessorTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Check processing started for " + name + " in thread " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Check processing ended for " + name + " in thread " + Thread.currentThread().getName());
	}
}
