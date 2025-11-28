package com.rojatech.ch04.concurrency;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {
	static 	Map<String, String> coursesRating = new ConcurrentHashMap<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		coursesRating.put("A", "5.0");
	}
	
	public static void main(String[] args) {
	
	ConcurrentHashMapDemo th = new ConcurrentHashMapDemo();
	th.start();
	
	coursesRating.put("Java", "10.0");
	coursesRating.put("V", "9.0");
	coursesRating.put("S", "8.0");
	coursesRating.put("J", "7.0");
	coursesRating.put("E", "8.0");
	
	Iterator<String> it = coursesRating.keySet().iterator();
	
	while (it.hasNext()) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(coursesRating.get(it.next()));
	}
	System.out.println(coursesRating);

	}

}
