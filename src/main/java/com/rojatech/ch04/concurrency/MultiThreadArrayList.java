package com.rojatech.ch04.concurrency;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MultiThreadArrayList extends Thread {

	static List<String> courses = new CopyOnWriteArrayList<String>();
	
	@Override 
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.add("Kubernetes");
	}
	
	public static void main(String[] args) {

		MultiThreadArrayList mat = new MultiThreadArrayList();
		mat.start();
		
		courses.add("Java");
		courses.add("Spring Boot");
		courses.add("Hibernate");
		courses.add("React");
		courses.add("Docker");
		
		Iterator<String> it = courses.iterator();
		
		while(it.hasNext()) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(it.next());
		}
		
		System.out.println(courses);
		
	}

}
 