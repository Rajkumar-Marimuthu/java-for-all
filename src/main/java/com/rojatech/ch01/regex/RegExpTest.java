package com.rojatech.ch01.regex;

import java.util.Scanner;

public class RegExpTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        String pattern = "[a-zA-Z !,?._'@]+";
        if (s.matches(pattern) && !s.trim().isEmpty()) {
            String[] tokens = s.trim().split("[ !,?._'@]+");
            System.out.println(s.length());
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        } else {
            System.out.print(0);
        }
        scan.close();
    }
}
