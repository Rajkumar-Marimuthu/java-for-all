package com.rojatech.ch01.datatypes;

public class SwitchSample {

	public static void main(String[] args) {
		char a = 'C';
		
		switch (a) {
		case 'A':
			System.out.println("A");
		case 'B':
			System.out.println("B");
		case 'C':
			System.out.println("C");
		case 'D':
			System.out.println("D");
		case 'E':
			System.out.println("E");
		default:
			System.out.println('Z');
		}

	}

}
