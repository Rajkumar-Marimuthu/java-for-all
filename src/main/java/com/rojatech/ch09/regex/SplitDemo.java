package com.rojatech.ch09.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitDemo {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\s");
		Pattern pattern2 = Pattern.compile("[.]");
		String[] words = pattern.split("hello how are you?");
		String[] words2 = pattern2.split("www.harvard.com");
		for (String string : words) {
			System.out.println(string);
		}
		for (String string : words2) {
			System.out.println(string);
		}
		
		String para = "hello how are you? It is too late. where are you?";
		String[] sentences = para.split("(?<=[?!.])"); // positive go ahead - to retain delimiters
		for (String string : sentences) {
			System.out.println(string.replaceAll("^\\s+","")); // to remove space at first
		}
	}

}
