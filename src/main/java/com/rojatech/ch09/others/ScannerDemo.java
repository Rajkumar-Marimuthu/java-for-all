package com.rojatech.ch09.others;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		double d = scanner.nextDouble();
		scanner.nextLine();
		String mystr = scanner.nextLine();
		//Integer myint = scanner.nextInt();
		
		System.out.println(mystr + " " + mystr);
		System.out.println(mystr + " " + d);
		System.out.println(mystr + " " + i);

		scanner.close();
	}
}
