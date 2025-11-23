package com.rojatech.ch01.array;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }


        final char[] charA = a.toLowerCase().toCharArray();
        final char[] charB = b.toLowerCase().toCharArray();

        Arrays.sort(charA);
        System.out.println(charA);
        Arrays.sort(charB);
        System.out.println(charB);
        return Arrays.equals(charA, charB);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
