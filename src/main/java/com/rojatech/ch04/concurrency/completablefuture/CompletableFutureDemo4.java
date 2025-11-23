package com.rojatech.ch04.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDemo4 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Accessing customer loyalty points from database...");
            // Simulate a long-running computation
            try {
                TimeUnit.SECONDS.sleep(8);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 200;
        });

        // Non-blocking call to get the result
       /* future.thenAccept(result -> {
            System.out.println("The result is: " + result);
        });*/

        CompletableFuture<Integer> bonusFuture = future.thenApply(points -> {
            System.out.println("Calculating bonus points...");
            return points + 50; // Add bonus points
        });

       // bonusFuture.complete(125); // Manually complete the future with a specific value

        System.out.println("Doing other tasks while waiting for the loyalty points...");
        // Block and get the final result
        Integer finalPoints = bonusFuture.get();
        System.out.println("Total loyalty points (with bonus): " + finalPoints);
    }
}
