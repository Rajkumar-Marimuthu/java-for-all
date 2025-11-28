package com.rojatech.ch04.concurrency.forkjoin;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.RecursiveTask;

@AllArgsConstructor
@Slf4j
public class SumListTask extends RecursiveTask<Long> {
    private List<Long> numbers;
    private static final int THRESHOLD = 5;

    @Override
    protected Long compute() {
        if(numbers.size() <= THRESHOLD) {
            long sum = computeDirectly();
            log.info("Sum of {} = {}", numbers.toString(), sum);
            return sum;
        } else {
            int mid = numbers.size() / 2;
            SumListTask leftTask = new SumListTask(numbers.subList(0, mid));
            SumListTask rightTask = new SumListTask(numbers.subList(mid, numbers.size()));
            invokeAll(leftTask, rightTask);
            return leftTask.join() + rightTask.join();
        }

    }

    protected long computeDirectly() {
        long sum = 0;
        for(Long num : numbers) {
            sum += num;
        }
        return sum;
    }
}
