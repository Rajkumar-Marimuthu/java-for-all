package com.rojatech.javachallenges.others;

import java.util.Arrays;

public class Anagrams2 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "ahell";
		String str3 = "ollhe";
		
		Boolean res = isAnagram(str1, str2);
		System.out.println(res?"Anagrams":"Not Anagrams");
		
		Boolean res1 = isAnagram(str1, str3);
		System.out.println(res1?"Anagrams":"Not Anagrams");
	}

	public static Boolean isAnagram(String s1, String s2) {
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if (Arrays.equals(c1, c2)) {
			return true;
		} else {
			return false;	
		}
	}
}
