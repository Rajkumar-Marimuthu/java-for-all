package com.rojatech.ch04.concurrency.forkjoin;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.RecursiveAction;

@AllArgsConstructor
@Slf4j
public class SumListAction extends RecursiveAction {
    private List<Long> numbers;
    private static final int THRESHOLD = 5;

    @Override
    protected void compute() {
        if(numbers.size() <= THRESHOLD) {
            long sum = computeDirectly();
            log.info("Sum of {} = {}", numbers.toString(), sum);
        } else {
            int mid = numbers.size() / 2;
            SumListAction leftTask = new SumListAction(numbers.subList(0, mid));
            SumListAction rightTask = new SumListAction(numbers.subList(mid, numbers.size()));
            invokeAll(leftTask, rightTask);
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
