package com.rojatech.ch09.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
 * Leading zeros are allowed. 
 * The length of A, B, C, or D can't be greater than 3.
 * Valid IP Addresses:
 * 	000.12.12.034
	121.234.12.12
	23.45.12.56
	
	Invalid IP Addresses:
	
	000.12.234.23.23
	666.666.23.23
	.213.123.23.32
	23.45.22.32.
	I.Am.not.an.ip
 */
public class RegExIPAddressValidator {

	public static void main(String[] args) {
		String pattern = "[0-20-50-5]\\.[0-20-50-5]\\.[0-20-50-5]\\.[0-20-50-5]";
		
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher("0.12.12.340");
		boolean matched = m.matches();
		if (matched) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

}
