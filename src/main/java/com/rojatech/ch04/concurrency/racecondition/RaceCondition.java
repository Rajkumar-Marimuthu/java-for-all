package com.rojatech.ch04.concurrency.racecondition;
// Race conditions solved by synchronized block
public class RaceCondition {

	private static Long counter = 0l;
	private static final Object lock = new Object();
	
	public static void main(String[] args) {

		Thread incrementThread = new Thread(()-> {
					for(int i=0; i<1000;i++) {
						synchronized (lock) { counter++;}
					}
				});
		
		Thread decrementThread = new Thread(()->{
			for (int i=0; i<1000;i++) {
				synchronized(lock){counter--;}
			}
		});
		
		incrementThread.start();
		decrementThread.start();
		try {
			incrementThread.join();
			decrementThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(counter);
	}
}
