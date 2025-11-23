package com.rojatech.ch01.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfRows = scanner.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<noOfRows; i++){
            int rowSize = scanner.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<rowSize; j++){
                row.add(scanner.nextInt());
            }
            list.add(row);
        }
        int noOfQueries = scanner.nextInt();
        for(int i=0; i<noOfQueries; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
