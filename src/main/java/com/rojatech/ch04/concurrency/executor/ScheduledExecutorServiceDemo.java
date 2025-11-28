package com.rojatech.ch04.concurrency.executor;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

@Slf4j
public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("ScheduledExecutorServiceDemo main method executed");
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        ScheduledFuture<?> sf = scheduledExecutorService.schedule(() -> {
            String threadName = Thread.currentThread().getName();
            return(threadName + ": Scheduled task executed");
        }, 5, java.util.concurrent.TimeUnit.SECONDS);
        log.info("Scheduled task submitted, waiting for execution...");
        log.info((String) sf.get());
        scheduledExecutorService.shutdown();
    }
}
