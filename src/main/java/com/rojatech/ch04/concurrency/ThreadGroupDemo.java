package com.rojatech.ch04.concurrency;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
	
		ThreadGroup tg1 = new ThreadGroup("Parent Group");
		ThreadGroup tg2 = new ThreadGroup(tg1, "child Group");
		
		new Thread(tg1,()->System.out.println("t1"),"t1").start();
		new Thread(tg1,()->System.out.println("t2"),"t2").start();
		
	}

}
