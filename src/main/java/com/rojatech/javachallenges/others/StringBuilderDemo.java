package com.rojatech.javachallenges.others;

import java.util.function.Consumer;

public class StringBuilderDemo {

    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        Consumer<String> consumer = sb::append; // StringBuilder append(String str)
        consumer.accept("Hi");
        consumer.accept(" , Hello");
        consumer.accept(" How are you?");

        System.out.println(sb);
    }
}
