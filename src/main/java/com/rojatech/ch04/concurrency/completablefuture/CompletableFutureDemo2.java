package com.rojatech.ch04.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo2 {

	public static void main(String[] args) {
		CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Async task one completed";
		});
		
		// call back
		cf.thenAccept(result -> System.out.println(result));
		
		// another async operation
		
		CompletableFuture<Void> combined = cf.thenAcceptAsync(result -> {
			System.out.println("Additonal asyn task exectuted");
		});
		
		try {
			combined.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
