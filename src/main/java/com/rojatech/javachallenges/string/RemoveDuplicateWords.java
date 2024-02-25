package com.rojatech.javachallenges.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		//String sentence = "I love Love to To tO code";
				
		String regex = "\\b(\\w+)\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
         // HashSet to store unique words
            HashSet<String> uniqueWords = new HashSet<>();
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
            	String word = m.group(1);
            	if (!word.toLowerCase().equals(uniqueWords.contains(word.toLowerCase()))) {
            	uniqueWords.add(word);
            	}
                //input = input.replaceAll(m., /* The replacement. */);
            }
            System.out.println(uniqueWords);
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
	}

}
