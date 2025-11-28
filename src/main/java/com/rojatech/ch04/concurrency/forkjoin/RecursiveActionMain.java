package com.rojatech.ch04.concurrency.forkjoin;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class RecursiveActionMain {

    public static void main(String[] args) {
        Random random = new Random();
        List<Long> data = random.longs(11,1,5).boxed().toList();

        ForkJoinPool pool = new ForkJoinPool();
        SumListAction task = new SumListAction(data);
        pool.invoke(task);
    }
}
