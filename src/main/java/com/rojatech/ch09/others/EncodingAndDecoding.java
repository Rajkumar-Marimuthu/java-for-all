package com.rojatech.ch09.others;

import java.util.Base64;

public class EncodingAndDecoding {

	public static void main(String[] args) {
		String encoded = Base64.getEncoder().encodeToString("Bye".getBytes());
		System.out.println(encoded);
		
		String decoded = new String(Base64.getDecoder().decode("aGVsbG8="));
		System.out.println(decoded);
		
	}

}
