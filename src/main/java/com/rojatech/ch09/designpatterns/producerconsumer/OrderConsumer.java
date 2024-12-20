package com.rojatech.ch09.designpatterns.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class OrderConsumer implements Runnable {

	private final BlockingQueue<String> queue;
	
	public OrderConsumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		try {
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
