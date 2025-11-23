package com.rojatech.ch01.bitset;

import java.util.Scanner;

public class BitSetDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        java.util.BitSet b1 = new java.util.BitSet(n);
        java.util.BitSet b2 = new java.util.BitSet(n);

        while (m-- > 0) {
            String op = scanner.next();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            switch (op) {
                case "AND":
                    if (a == 1) b1.and(b2); else b2.and(b1);
                    break;
                case "OR":
                    if (a == 1) b1.or(b2); else b2.or(b1);
                    break;
                case "XOR":
                    if (a == 1) b1.xor(b2); else b2.xor(b1);
                    break;
                case "FLIP":
                    if (a == 1) b1.flip(b); else b2.flip(b);
                    break;
                case "SET":
                    if (a == 1) b1.set(b); else b2.set(b);
                    break;
                default:
                    // ignore invalid op
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}
