package com.rojatech.ch04.concurrency.forkjoin;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

@Slf4j
public class RecursiveTaskMain {

    public static void main(String[] args) {
        Random random = new Random();
        List<Long> data = random.longs(11,1,5).boxed().toList();

        ForkJoinPool pool = new ForkJoinPool();
        SumListTask task = new SumListTask(data);
        log.info("Sum: {}", pool.invoke(task));
    }
}
