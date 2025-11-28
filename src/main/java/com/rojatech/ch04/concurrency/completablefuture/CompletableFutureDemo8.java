package com.rojatech.ch04.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDemo8 {
    public static void main(String[] args) {
        final String customerCode = "";

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(
                () -> {
                    if (customerCode.isEmpty()) {
                        throw new IllegalArgumentException("Customer code cannot be empty");
                    } else {
                        System.out.println("Fetching data for customer code: " + customerCode);
                        try {
                            TimeUnit.SECONDS.sleep(5);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        return 100; // Simulated loyalty points
                    }
                }).exceptionally(ex -> {
            System.out.println("Exception occurred: " + ex.getMessage());
            return 0; // Default value in case of exception
        });
        System.out.println("Doing other tasks while waiting for the loyalty points...");
        Integer finalPoints = future.join();
        System.out.println("Total loyalty points: " + finalPoints);
    }
}
