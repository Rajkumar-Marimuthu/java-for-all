package com.rojatech.javachallenges.others;

/* Count Knights that can attack a given pawn in an N * N boardCount Knights that can attack a given pawn in an N * N board */

public class ChessCountKnights {

	
	public static void main(String[] args) {

		int[][] kns = {{0,4},{4,5},{1,4},{3,1}};
		int[] pns = {2,3};
		
		// size of chess board M*M
		int m = 5;
		
		int countKns = countKnights(kns, pns, m);
		System.out.printf("countKns = %s", countKns);
	}
	
	public static int countKnights(int[][] kns, int[] pns, int m) {
		int countKns = 0;
		System.out.println(kns.length);

		for (int i=0; i<kns.length; i++) {
			System.out.println(kns[i]);
			int x = Math.abs(kns[i][0] - pns[0]);
			int y = Math.abs(kns[i][1] - pns[1]);
			
			if ( (x == 2 && y == 1) || (x==1 && y==2)) {
				System.out.println("Pawn attacked.");
				countKns++;
			}
		}
		return countKns;
	}

}
