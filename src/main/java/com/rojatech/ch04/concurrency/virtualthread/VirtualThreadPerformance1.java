package com.rojatech.ch04.concurrency.virtualthread;

public class VirtualThreadPerformance1 {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            Thread.ofPlatform().start(() -> System.out.println("Platform Thread - " + Thread.currentThread()));
        }

        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time taken with Platform Threads: " + elapsedTime + " ms");
        System.out.println("Time taken with Platform Threads: " + elapsedTime/1000 + " s");

/*        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            Thread thread = Thread.ofVirtual().start(() -> System.out.println("Virtual Thread - " + Thread.currentThread()));
            thread.join();
        }

        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time taken with Platform Threads: " + elapsedTime + " ms");
        System.out.println("Time taken with Platform Threads: " + elapsedTime/1000 + " s");*/

    }
}
