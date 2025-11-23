package com.rojatech.ch01.regex;

import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {
        String regex = "A";
        Pattern pattern = Pattern.compile(regex);
        String testString = "ABCD";
        boolean matches = pattern.matcher(testString).find();
        System.out.println("Does the string contain 'A'? " + matches);
    }
}
