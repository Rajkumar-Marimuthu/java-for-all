package com.rojatech.ch09.others;
import java.util.Scanner;

public class EOF_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while(sc.hasNextLine()) {
			System.out.println(i + sc.nextLine().trim());
			i++;
		}

	}

}
