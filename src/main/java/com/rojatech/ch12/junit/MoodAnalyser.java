package com.rojatech.ch12.junit;

public class MoodAnalyser {
    public String analyseMood(String s) {
        if (s.contains("good")) {
            return "GOOD";
        } else {
            return "HAPPY";
        }

    }
}
