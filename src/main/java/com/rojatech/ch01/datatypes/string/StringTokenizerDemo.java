package com.rojatech.ch01.datatypes.string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("you are, 	the creator of your destiny!");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		StringTokenizer st1 = new StringTokenizer("you are, 	the creator of your destiny!", ",");
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}

	}

}
