package com.rojatech.ch04.concurrency.executor;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {

	public static void main(String[] args) {
		MyCallable[] callables = {new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40), new MyCallable(50), new MyCallable(60)};
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		Arrays.stream(callables).forEach(c ->{
			Future<Integer> future = es.submit(c);	
			try {
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
        });
		
		es.shutdown();
	}

}
