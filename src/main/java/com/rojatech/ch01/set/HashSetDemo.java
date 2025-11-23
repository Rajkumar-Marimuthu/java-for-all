package com.rojatech.ch01.set;

import java.util.Scanner;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.next());
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];
        for (int i = 0; i < t; i++) {
            pair_left[i] = scanner.next();
            pair_right[i] = scanner.next();
        }
        Set<String> set = new java.util.HashSet<>();
        for (int i = 0; i < t; i++) {
            if(pair_left[i].equals(pair_right[i])) {
                System.out.println(i + " " + pair_left[i] + "," + pair_right[i]);
            }
            set.add(pair_left[i] + pair_right[i]);
            //System.out.println(set.size());
        }
        System.out.println(set.size());
        scanner.close();
    }
}
