package com.rojatech.ch01.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

    public static void main(String[] args) {
        String text = "The cat sat on the catalog.";
        String regex = "\\bcat\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}
