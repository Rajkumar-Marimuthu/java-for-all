package com.rojatech.ch04.concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + ": Task executed");
        });

        executorService.shutdown();
    }
}
