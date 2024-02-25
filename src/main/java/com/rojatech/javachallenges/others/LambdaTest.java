package com.rojatech.javachallenges.others;

import java.util.Scanner;
import java.util.function.Predicate;

public class LambdaTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numOfTc = scanner.nextInt();
		for (int i=0; i<numOfTc; i++) {
			Integer firstNum = scanner.nextInt();
			Integer secondNum = scanner.nextInt();	

			switch (firstNum) {
			case 1:
				System.out.println(isOdd().test(secondNum)?"ODD":"EVEN");
				break;
			case 2:
				System.out.println(isPrime().test(secondNum)?"PRIME":"COMPOSITE");
				break;
			case 3:
				System.out.println(isPolindrome().test(secondNum)?"POLINDROME":"NOT POLINDROME");
				break;
			default:
				break;
			}
		}		
	}

	public static Predicate<Integer> isOdd() {
		return (i) -> { 
			if(i%2==1) { 
				return true;
			} else {
				return false; 
			}
		};
	}
	
	public static Predicate<Integer> isPrime() {
		return (num) -> { 
			for (int i=2; i<=num/2;i++) {
				if (num%i == 0) {
					return false;
				} else {
					return true;
				}
			}
			return true;
		};
	}
	
	public static Predicate<Integer> isPolindrome() {
		return (num) -> { 
			String str = String.valueOf(num);
			int numLen = str.length();
			for(int i=0; i<=numLen/2;i++) {
				if (str.charAt(i) != str.charAt(numLen-1-i)) {
					return false;
				} 
			}
			return true;
		};
	}
}