package com.rojatech.ch09.regex;

public class MobileNumberValidator {

	public static void main(String[] args) {
		String mobileNum = "3456234583";
		if (mobileNum.matches("\\d{10}")) {
			System.out.println("Valid mobile number");
		} else {
			System.out.println("Invalid mobile number");
		}
		

	}

}
