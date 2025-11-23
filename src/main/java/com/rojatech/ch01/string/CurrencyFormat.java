package com.rojatech.ch01.string;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        final String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);

        final String india = NumberFormat.getCurrencyInstance(new Locale.Builder().setLanguage("en").setRegion("IN").build()).format(payment);

        final String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

        final String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
