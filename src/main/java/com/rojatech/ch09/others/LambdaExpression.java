package com.rojatech.ch09.others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker (PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd() {
		return (num) -> (num % 2 == 0) ? false:true;
	}

	public PerformOperation isPrime() {
		return (num) -> {
			if (num <= 2 ) {
				return true;
			}
			for (int i=2; i<=num/2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		};
	}

	public PerformOperation isPalindrome() {
		return (num) -> {
			int temp = num;
			int rev = 0;
			int r;
			while (num > 0) {
				r = num%10;
				rev = rev * 10 + r;
				num = num/10;
			}
			if (temp == rev) {
				return true;
			} else {
				return false;
			}
		};
	}
}

public class LambdaExpression {

	public static void main(String[] args) throws NumberFormatException, IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		
		boolean ret = false;
		String ans = null;
		while (T-->0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
				
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
				
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
			}
			System.out.println(ans);
		}

	}

}
