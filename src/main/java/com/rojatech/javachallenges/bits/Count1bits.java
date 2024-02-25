package com.rojatech.javachallenges.bits;

public class Count1bits {

	public static void main(String[] args) {
		// Input : n = 6
		// Output : 2
		// Binary representation of 6 is 110 and has 2 set bits
		
		// Input : n = 13
		// Output : 3
		// Binary representation of 13 is 1101 and has 3 set bits
				
		int n = 13;
		int count = countSetBits(n);
		System.out.println(count);
	}

	private static int countSetBits(int n) {
		int count = 0;
		while (n > 0) {
			count += (n&1) ;
			n >>=1;
		}
		return count;
	}

}
