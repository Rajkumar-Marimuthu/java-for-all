package com.rojatech.javachallenges.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedWordMatcher {

    public static void main(String[] args) {
    	// Test Case: 1
        String str1
            = "I love Love to To tO code";
        System.out.println(
            removeDuplicateWords(str1));
 
        // Test Case: 2
        String str2
            = "I I I don't don't want want want to to go go to to bed bed bed";
        System.out.println(
            removeDuplicateWords(str2));
 
        // Test Case: 3
        String str3
            = "Goodbye bye bye world world world\r\n"
            		+ "Sam went went to to to his business\r\n"
            		+ "Reya is is the the best player in eye eye game\r\n"
            		+ "in inthe\r\n"
            		+ "Hello hello Ab aB";
        System.out.println(
            removeDuplicateWords(str3));
    }
    
    public static String removeDuplicateWords(String input) {
    	String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
    	Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    	
    	Matcher m = p.matcher(input);
    	while (m.find()) {
    		System.out.println(m.group() + " , " + m.group(1));
    		input = input.replaceAll(m.group(), m.group(1));
    	}
    	return input;
    }
}

