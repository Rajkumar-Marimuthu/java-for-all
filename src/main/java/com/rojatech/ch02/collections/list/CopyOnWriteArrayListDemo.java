package com.rojatech.ch02.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class CopyOnWriteArrayListDemo {

    private CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>();

    public CopyOnWriteArrayListDemo() {
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }
    }

    public void iterateNumbers() {

        Thread thread1 = new Thread(() -> {
            for (Integer number : numbers) {
                System.out.println(Thread.currentThread().getName() + " Iterated number: " + number);
            }
        });
        thread1.start();
    }

    public void modifyNumbers() {

        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                numbers.add(i);
                System.out.println(Thread.currentThread().getName() + " Added number: " + i);
            }
        });
        thread2.start();
    }

    public static void main(String[] args) {
        CopyOnWriteArrayListDemo demo = new CopyOnWriteArrayListDemo();
        demo.iterateNumbers();
        demo.modifyNumbers();
    }
}
