package com.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstPro {
    public static void main(String[] args) {

        //List<Integer> list = List.of(4,33, 5, 6,9,34,12, 56, 98, 50);

        List<Integer> list = Arrays.asList(4, 33, 5, 6, 9, 34, 12, 56, 98, 50);
        Integer lowest = list.stream().min((a,b) -> (a-b)).get();
        System.out.println(lowest);
        Collections.sort(list);
        Integer secondLargest = list.get(list.size()-2);
        System.out.println(secondLargest);


        for (int i=0; i<list.size()-1; i++) {
            if(list.get(i) > list.get(i+1)) {
                int temp = list.get(i);
                list.set(i, list.get(i+1));
                list.set(i+1, temp);
            }
        }

        System.out.println(list);

        System.out.println("Sucessfully completed..");
    }
}
