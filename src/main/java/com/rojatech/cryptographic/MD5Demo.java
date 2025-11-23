package com.rojatech.cryptographic;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Scanner;

public class MD5Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String md5Hash = calculateMD5(input);
        System.out.println(md5Hash);
        scanner.close();
    }

    private static String calculateMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(input.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : array) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
