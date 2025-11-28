package com.rojatech.ch04.concurrency.executor;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Slf4j
public class ScheduledExecutorServiceDemo2 {
    private static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        log.info("ScheduledExecutorServiceDemo2 is running...");

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(() -> {
            String threadName = Thread.currentThread().getName();
            count++;
            log.info(threadName + ": Executing scheduled task " + count + " at " + LocalDateTime.now());
        }, 5, 1, java.util.concurrent.TimeUnit.SECONDS);

        while (count != 5) {
            TimeUnit.MILLISECONDS.sleep(100);
        }

        log.info("Reached 5 executions, cancelling the scheduled task.");
        scheduledFuture.cancel(true);
        scheduledExecutorService.shutdown();
    }
}
