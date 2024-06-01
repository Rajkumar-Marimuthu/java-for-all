package com.rojatech.ch01.datatypes.string;

import java.util.*;

public class DuplicateRemoval {

    public static void main(String[] args) {
        String str = "hello how are you";
        Set<Character> set = new LinkedHashSet<Character>();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if(set.add(c)) {
                result.append(c);
            }
        }

        System.out.println(set);
        System.out.println(result);
    }

}
