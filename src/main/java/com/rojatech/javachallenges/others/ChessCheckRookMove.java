package com.rojatech.javachallenges.others;

public class ChessCheckRookMove {

	public static void main(String[] args) {

		int m=8;
		int cr = 8;
		int cc = 8;
		int dr = 8;
		int dc = 4;
		
		String res = checkRookMove(cr, cc, dr, dc);
		System.out.println(res);
		
	}

	public static String checkRookMove(int cr, int cc, int dr, int dc) {
		if (cr == dr || cc == dc) {
			return "Possible";
		} 
		return "Not Possible";
	}
}
