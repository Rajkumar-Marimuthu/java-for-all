package com.rojatech.ch04.concurrency.executor;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<String> task1 = () -> {
            String threadName = Thread.currentThread().getName();
            TimeUnit.SECONDS.sleep(2); // Simulate a delay
            return threadName + ": executing Task 1";
        };

        Callable<String> task2 = () -> {
            String threadName = Thread.currentThread().getName();
            TimeUnit.SECONDS.sleep(1);
            return threadName + ": executing Task 2";
        };

        Callable<String> task3 = () -> {
            String threadName = Thread.currentThread().getName();
            return threadName + ": executing Task 3";
        };

        List<Callable<String>> taskList = List.of(task1, task2, task3);

        final String result = executorService.invokeAny(taskList);
        System.out.println("Result from invokeAny: " + result);
        executorService.shutdown();
    }
}
