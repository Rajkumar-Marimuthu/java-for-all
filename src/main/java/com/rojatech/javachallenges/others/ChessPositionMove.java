package com.rojatech.javachallenges.others;

public class ChessPositionMove {

	public static void main(String[] args) {
		String sp = "5h";
		String ep = move(sp, 11,25);
		System.out.println(ep);
	}

	public static String move(String sp, int r, int c) {
		
		int sr = Character.getNumericValue(sp.charAt(0));
		
		// convert 'a' to 1
		int sc = sp.charAt(1)-96;
		
		int er = sr+r;
		
		er = er%8;
		if (er == 0) {
			er = 8;
		}

		int ec = sc+c;
		
		ec = ec%8;
		if (ec == 0) {
			ec = 8;
		}
		
		// convert 1 to 'a'
		return er+Character.toString(ec+96);
	}
}
