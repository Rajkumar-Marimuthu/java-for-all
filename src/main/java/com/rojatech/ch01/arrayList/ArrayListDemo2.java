package com.rojatech.ch01.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();
        List<Integer> list = new ArrayList<>(noOfElements);
        for (int i = 0; i < noOfElements; i++) {
            list.add(scanner.nextInt());
        }
        int noOfQueries = scanner.nextInt();
        for (int i = 0; i < noOfQueries; i++) {
            String queryType = scanner.next();
            if ("Insert".equals(queryType)) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                list.add(x, y);
            } else if ("Delete".equals(queryType)) {
                int x = scanner.nextInt();
                list.remove(x);
            }
        }
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
