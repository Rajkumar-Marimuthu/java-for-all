package com.rojatech.ch01.datatypes.string;

public class RightAngledTrianglePattern {

	public static void main(String[] args) {
		int n = 10;
		for (int i=0; i<n;i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
