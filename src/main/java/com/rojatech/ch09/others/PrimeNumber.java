package com.rojatech.ch09.others;
public class PrimeNumber {

	public boolean isPrime(int n) {
		for (int j=2;j<=n/2;j++) {
			if (n%j == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		// what is prime number?
		// a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11).
		
		PrimeNumber pn = new PrimeNumber();
		
		for (int i=2; i<=100; i++) {
			System.out.println(i + " " + pn.isPrime(i));
		}
	}

}
