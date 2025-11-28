package com.rojatech.ch04.concurrency.completablefuture;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

// Example of composing CompletableFutures using thenCombine which returns a new CompletableFuture
public class CompletableFutureDemo6 {

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
        }).thenCombine(CompletableFuture.supplyAsync(() ->{
            System.out.println("Adding bonus points...");
            LocalDate today = LocalDate.now();
            DayOfWeek dayOfWeek = today.getDayOfWeek();
            if(dayOfWeek.equals(DayOfWeek.WEDNESDAY)) {
                return 5;
            } else if (dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY)) {
                return 10;
            }
            return 0;
        }), Integer::sum);

        // future.complete(125); // Manually complete the future with a specific value

        System.out.println("Doing other tasks while waiting for the loyalty points...");
        // Block and get the final result
        Integer finalPoints = future.get();
        System.out.println("Total loyalty points (with bonus): " + finalPoints);
    }
}
