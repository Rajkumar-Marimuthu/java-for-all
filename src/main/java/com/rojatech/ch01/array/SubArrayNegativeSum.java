package com.rojatech.ch01.array;

import java.util.Scanner;

public class SubArrayNegativeSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0; // To count subarrays with negative sum 1 -2 4 -5 1
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
