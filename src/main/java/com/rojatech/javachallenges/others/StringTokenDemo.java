package com.rojatech.javachallenges.others;

public class StringTokenDemo {

	public static void main(String[] args) {
		String s = "He is a very very good boy, isn't he?";
		
		String[] splitted = s.split("[ !,?._'@]+",0);
		System.out.println(splitted.length);
		
		for (String string : splitted) {
			System.out.println(string);
		}
	}

}
