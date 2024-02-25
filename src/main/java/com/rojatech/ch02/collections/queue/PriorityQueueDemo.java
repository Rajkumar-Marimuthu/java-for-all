package com.rojatech.ch02.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		System.out.println(queue.peek());
		
		//System.out.println(queue.element());
		
		for (int i=20; i<=30; i++) {
			queue.offer(i);
		}
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		System.out.println(queue);
	}

}
