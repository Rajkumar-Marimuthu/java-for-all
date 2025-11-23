package com.rojatech.ch05.exceptions;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        if (scanner.hasNextInt()) {
            x = scanner.nextInt();
        } else {
            System.out.println("java.util.InputMismatchException");
            return;
        }

        if (scanner.hasNextInt()) {
            y = scanner.nextInt();
        } else {
            System.out.println("java.util.InputMismatchException");
            return;
        }
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
        scanner.close();
    }
}
