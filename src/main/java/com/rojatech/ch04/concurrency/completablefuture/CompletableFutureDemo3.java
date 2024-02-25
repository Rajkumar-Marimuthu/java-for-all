package com.rojatech.ch04.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo3 {

	public static void main(String[] args) {
		CompletableFuture<String> cf = CompletableFuture.supplyAsync(()-> {
			return "Hello ";
		});
		
		CompletableFuture<String> result =  cf.thenApply(res -> {
			return res + "world!";
		});
		
		try {
			String finalResult = result.get();
			System.out.println(finalResult);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
