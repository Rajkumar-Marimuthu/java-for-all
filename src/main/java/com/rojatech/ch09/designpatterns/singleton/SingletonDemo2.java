// Lazy instantiation
package com.rojatech.ch09.designpatterns.singleton;

public class SingletonDemo2 {
	
	private static SingletonDemo2 singletonDemo2;
	
	private SingletonDemo2 () {
		System.out.println("SingletonDemo2 constructor");
	}
	
	// synchronized so that multiple threads can�t access it simultaneously.
	/*
	 * synchronized public static SingletonDemo2 getInstance() { if (singletonDemo2
	 * == null) { singletonDemo2 = new SingletonDemo2(); } return singletonDemo2; }
	 */
	
	// the block which creates instance is synchronized so that minimum number of threads have to wait and 
	// that�s only for first time.
	
	public static SingletonDemo2 getInstance() {
		if (singletonDemo2 == null) {
			synchronized (SingletonDemo2.class) {
				singletonDemo2 = new SingletonDemo2();
			}
		}
		return singletonDemo2;
	}

	public static void main(String[] args) {
	
		SingletonDemo2 sd = SingletonDemo2.getInstance();
		System.out.println(sd);
		SingletonDemo2 sd1 = SingletonDemo2.getInstance();
		System.out.println(sd1);
	}
}
