package com.rojatech.ch04.concurrency.virtualthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VirtualThreadPerformance2 {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Task completed by: " + Thread.currentThread());
        };

        long startTime = System.currentTimeMillis();
/*        try(ExecutorService executor = Executors.newFixedThreadPool(100)) {
            for (int i = 0; i < 10_000; i++) {
                executor.submit(task);
            }
        }*/

        try(ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10_000; i++) {
                executor.submit(task);
            }
        }

        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time taken with Platform Threads: " + elapsedTime + " ms");
    }
}
