package com.rojatech.javachallenges.others;

import java.util.HashMap;

public class Anagram {

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
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		int len1 = s1.length();
		int len2 = s2.length();
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		for (int i=0; i<len1; i++) {
			char c = s1.charAt(i);
			map1.put(c, map1.get(c)!=null ? map1.get(c)+1 : 0);
		}
		for (int i=0; i<len2; i++) {
			char c = s2.charAt(i);
			map2.put(c, map2.get(c) != null ?map2.get(c)+1 : 0);
		}
		if (map1.equals(map2)) {
			return true;
		}
		return false;
	}

}
