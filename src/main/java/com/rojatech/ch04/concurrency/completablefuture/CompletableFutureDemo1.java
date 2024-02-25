package com.rojatech.ch04.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo1 {

	public static void main(String[] args) {
		CompletableFuture<String> cf = CompletableFuture.supplyAsync(()-> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Async task completed";
		});
		try {
			String str = cf.get();
			System.out.println(str);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("main method completed.");
	}

}
