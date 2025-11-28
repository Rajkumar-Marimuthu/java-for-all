package com.rojatech.ch04.concurrency.virtualthread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VirtualThreadDemo1 {

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            System.out.println("Virtual Thread: " + Thread.currentThread());
        };

        Thread virtualThread = Thread.ofVirtual().start(task);

        virtualThread.join();


        Runnable task2 = () -> {
            System.out.println("Another Virtual Thread: " + Thread.currentThread().getName() + " created from builder method");
        };

        Thread.Builder builder = Thread.ofVirtual().name("Custom-Virtual-Thread-",1);

        Thread t1 = builder.start(task2);
        Thread t2 = builder.start(task2);
        Thread t3 = builder.start(task2);
        Thread t4 = builder.start(task2);

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor() ) {
            for (int i = 0; i < 50; i++) {
                Future<?> future = executor.submit(() -> {
                    System.out.println("Virtual Thread from Executor: " + Thread.currentThread());
                });
                future.get();
            }
            System.out.println("All tasks submitted to virtual thread executor completed.");
        } catch (ExecutionException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
