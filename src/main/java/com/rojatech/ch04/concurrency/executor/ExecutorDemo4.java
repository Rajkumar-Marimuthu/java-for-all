package com.rojatech.ch04.concurrency.executor;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.*;

@Slf4j
public class ExecutorDemo4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<String> task1 = () -> {
            String threadName = Thread.currentThread().getName();
            TimeUnit.SECONDS.sleep(2); // Simulate a delay
            return threadName + ": executing Task 5";
        };

        Callable<String> task2 = () -> {
            String threadName = Thread.currentThread().getName();
            TimeUnit.SECONDS.sleep(4);
            return threadName + ": executing Task 5";
        };

        Callable<String> task3 = () -> {
            String threadName = Thread.currentThread().getName();
            TimeUnit.SECONDS.sleep(10);
            return threadName + ": executing Task 3";
        };

        List<Callable<String>> taskList = List.of(task1, task2, task3);

        log.info("Submitting tasks using invokeAll...");
        List<Future<String>> futures = executorService.invokeAll(taskList);
        log.info("All tasks submitted. Retrieving results...");
        for (Future<String> future : futures) {
            log.info("Result from invokeAll: " + future.get());
        }
        log.info("All results retrieved.");

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.SECONDS);
    }
}
