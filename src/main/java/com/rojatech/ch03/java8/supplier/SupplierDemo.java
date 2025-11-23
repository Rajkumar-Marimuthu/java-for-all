package com.rojatech.ch03.java8.supplier;

import java.security.SecureRandom;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "Hello, Supplier!";
        System.out.println(stringSupplier.get());

        Supplier<Integer> randomIntSupplier = () -> (int) new Random().nextInt(100);
        System.out.println("Random Integer: " + randomIntSupplier.get());

        Supplier<String> sixDigitOtpSupplier = () -> String.format("%06d", new SecureRandom().nextInt(1000000));
        for(int i=0; i<10; i++) {
            System.out.println("Generated OTP: " + sixDigitOtpSupplier.get());
        }
    }
}
