package com.rojatech.ch09.regex;

public class StringEmailValidator {

	public static void main(String[] args) {
		
		String email = "asfase@fasf.com";
		
		if (email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$")) {
			System.out.println("email valid..");
		} else {
			System.out.println("email is not valid..");
		}

	}

}
