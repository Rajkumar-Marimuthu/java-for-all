package com.rojatech.ch02.collections.map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeConcurrentHashMapDemo {

    ConcurrentHashMap<Integer, String> productMap = new ConcurrentHashMap<>();

    public ThreadSafeConcurrentHashMapDemo() {
        // Initialize the HashMap with some values
        for (int i = 1; i <= 1000; i++) {
            productMap.put(i, "Product" + i);
        }
    }

    public void iterateProducts() {
        Thread thread1 = new Thread(() -> {
            for (Integer key : productMap.keySet()) {
                System.out.println(Thread.currentThread().getName() + " Iterated product: " + productMap.get(key));
            }
        });
        thread1.start();
        System.out.println("Started product iteration thread");
    }

    public void modifyProducts() {
        Thread thread2 = new Thread(() -> {
            for (int key: productMap.keySet()) {
                if (key==500) {
                    productMap.remove(key);
                    System.out.println(Thread.currentThread().getName() + " Removed product with key: " + key);
                }
            }
        });
        thread2.start();
        System.out.println("Started product modification thread");
    }

    public static void main(String[] args) {
        ThreadSafeConcurrentHashMapDemo demo = new ThreadSafeConcurrentHashMapDemo();
        demo.iterateProducts();
        demo.modifyProducts();
    }
}
