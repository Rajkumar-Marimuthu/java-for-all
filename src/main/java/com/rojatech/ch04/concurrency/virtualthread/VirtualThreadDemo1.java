package com.rojatech.ch04.concurrency.virtualthread;

public class VirtualThreadDemo1 {

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Virtual Thread: " + Thread.currentThread().getName());
        };

//        Thread virtualThread = Thread.ofVirtual().start(task);
//
//        try {
//            virtualThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
