package com.rojatech.ch01.datatypes.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringSimple {

	public void springSplitSamples() {
		String str = "my name is rajkumar";
		String substr = str.substring(3);
		String substr1 = str.substring(11,14);
		String[] splitted = str.split(" ");
		Arrays.stream(splitted).forEach(System.out::println);
		System.out.println(substr);
		System.out.println(substr1);
	}
	public static void main (String[] args) {
		StringSimple ss = new StringSimple();
		ss.springSplitSamples();

		System.out.println("Enter the sentences to split");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine(); 
		String[] strarr = s.trim().split("[ !,?._'@]+", 0);
		if (!s.isEmpty())
			System.out.println(strarr.length);
		else 
			System.out.println(0);
		if (!s.isEmpty() && s.length()<=400000) {
			for (String str : strarr) {
				System.out.println(str);
			}
		} 
		scan.close();
	}
}
