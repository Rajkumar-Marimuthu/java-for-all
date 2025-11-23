package com.rojatech.ch01.map;

import java.util.Map;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> phoneBook = new java.util.HashMap<>();
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int phone = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            phoneBook.put(name, phone);
        }
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}
