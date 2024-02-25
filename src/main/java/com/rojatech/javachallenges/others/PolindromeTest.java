package com.rojatech.javachallenges.others;

public class PolindromeTest {
	
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 22;
		int num3 = 898;
		int num4 = 54545;
		int num5 = 123;
		String str1 = "madam";
		String str2 = "hello";
		
		System.out.println(isPolindrome(num1));
		System.out.println(isPolindrome(num2));
		System.out.println(isPolindrome(num3));
		System.out.println(isPolindrome(num4));
		System.out.println(isPolindrome(num5));
		System.out.println(isPolindrome(str1));
		System.out.println(isPolindrome(str2));
	}
	
	public static Boolean isPolindrome(int num) {
		String str = String.valueOf(num);
		int strLen = str.length();
		for(int i=0; i<=strLen/2;i++) {
			System.out.println("i = " + i + ", str.charAt(i): " + str.charAt(i) +", str.charAt(strLen-1-i): " + str.charAt(strLen-1-i));
			if (str.charAt(i) != str.charAt(strLen-1-i)) {
				return false;
			}
		}
		return true;
	}

	public static Boolean isPolindrome(String str) {
		int strLen = str.length();
		for(int i=0; i<=strLen/2;i++) {
			System.out.println("i = " + i + ", str.charAt(i): " + str.charAt(i) +", str.charAt(strLen-1-i): " + str.charAt(strLen-1-i));
			if (str.charAt(i) != str.charAt(strLen-1-i)) {
				return false;
			}
		}
		return true;
	}
}
