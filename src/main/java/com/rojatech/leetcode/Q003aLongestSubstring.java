package com.rojatech.leetcode;

import java.util.HashSet;
import java.util.Set;

// Given a string s, find the length of the longest substring without duplicate characters.
public class Q003aLongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }

    private static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            System.out.println("Current char: " + currentChar);
            while (charSet.contains(currentChar)) {
                System.out.println("left: " + left + ", right: " + right);
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(currentChar);
            System.out.println(charSet);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
