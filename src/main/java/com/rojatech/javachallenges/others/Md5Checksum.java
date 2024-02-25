package com.rojatech.javachallenges.others;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Checksum {

	public static void main(String[] args) {
		String s = "HelloWorldHowareyo";
		
		String res;
		try {
			if (s.length() >= 6 && s.length() <= 20) {
                if (s.matches("[a-zA-Z0-9]+")) {
			res = calculateMd5Checksum(s);
			System.out.println(res);
			System.out.println(res.length());
                }
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		

	}
	
	public static String calculateMd5Checksum(String input) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(input.getBytes());
		byte[] digest = md.digest();
		
		StringBuilder sb = new StringBuilder();
		for (byte b : digest) {
			sb.append(String.format("%02x", b));
		}
		return sb.toString();
	}

}
