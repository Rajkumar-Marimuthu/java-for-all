package com.rojatech.ch04.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {

	public static void main(String[] args) {
		
		CompletableFuture<Void> cf = CompletableFuture.runAsync(()-> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Async task completed");
		});
		
		try {
			cf.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println("main method completed");
	}

}
