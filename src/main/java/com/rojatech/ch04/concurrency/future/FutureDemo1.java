package com.rojatech.ch04.concurrency.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo1 {

    public static void main(String[] args) {
        System.out.println("Future Demo 1");

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            Thread.sleep(5000); // Simulate a long-running task
            return "Task Completed";
        };

        Future<String> future = executor.submit(task);
        System.out.println("Task submitted, waiting for result... You can do something else in the meantime.");
        try {
            String result = future.get(); // This will block until the result is available
            System.out.println("Result from Future: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
