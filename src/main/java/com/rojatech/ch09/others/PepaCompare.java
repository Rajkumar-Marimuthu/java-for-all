package com.rojatech.ch09.others;

import java.time.LocalDateTime;

public class PepaCompare {

	public static void main(String[] args) {
		LocalDateTime ldt1 = LocalDateTime.now(); // 2023/07/15
		LocalDateTime ldt2 = LocalDateTime.of(2023, 7, 6, 8, 15); 
		System.out.println(ldt1.compareTo(ldt2)); // 9
		
		System.out.println(ldt1.isAfter(ldt2)); // true
		System.out.println(ldt1.isBefore(ldt2)); // false
		System.out.println(ldt1.isEqual(ldt2)); // false
	}
}
