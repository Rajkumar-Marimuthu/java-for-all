package com.rojatech.javachallenges.others;

public class ChessBoardValidator {

	public static void main(String[] args) {
		System.out.println("Chess Board Validator");

		int n = 2;
		int[][] c = {{0,1},
				{1,0}};

		boolean res = validateChessBoard(c, n);
		if (res) {
			System.out.println("Valid Chessboard");
		} else {
			System.out.println("Invalid chessboard");
		}
	}

	public static boolean validateChessBoard(int[][] c, int n) {
		boolean isValid = true;
		System.out.println("validateChessBoard");
		int[] x = {0,-1,0,1};
		int[] y = {1,0,-1,0};

		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				for (int k=0; k<4;k++) {
					int newX = i + x[k];
					int newY = j + y[k];

					if (newX>=0 && newX<n && newY>=0 && newY<n && c[i][j] == c[newX][newY]) {
						System.out.println("return false");
						return false;
					}
				}
			}
		}
		System.out.println("return true");
		return isValid;
	}
}