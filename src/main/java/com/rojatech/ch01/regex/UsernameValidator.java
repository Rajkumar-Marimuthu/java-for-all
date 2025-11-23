package com.rojatech.ch01.regex;

public class UsernameValidator {

    public static void main(String[] args) {
        String username = "user_name123";
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

        if (username.matches(regex)) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }
}
