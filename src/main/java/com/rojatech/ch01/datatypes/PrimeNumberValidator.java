package com.rojatech.ch01.datatypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

import static java.lang.System.in;

public class PrimeNumberValidator {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        String n = bufferedReader.readLine();

        BigInteger bi = new BigInteger(n);
        boolean isPrime = bi.isProbablePrime(1);

        bufferedReader.close();
    }
}
