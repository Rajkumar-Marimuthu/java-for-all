package com.rojatech.ch01.regex;

public class RegEx2 {

    public static void main(String[] args) {
        //String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        String zero_to_255 = "(\\d{2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5]|\\d)";
        String pattern = zero_to_255 + "\\." + zero_to_255 + "\\." + zero_to_255 + "\\." + zero_to_255;

        System.out.println("".matches(pattern));
    }
}
