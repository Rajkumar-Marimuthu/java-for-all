package com.rojatech.ch02.collections.list;

import java.util.ArrayList;
import java.util.List;


public class FailFastDemo2 {

    private List<Integer> numbers = new ArrayList<>();

    public FailFastDemo2() {
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
        FailFastDemo2 demo = new FailFastDemo2();
        demo.iterateNumbers();
        demo.modifyNumbers();
    }
}
