package com.rojatech.ch09.others;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PepaPeriod {

	public static void main(String[] args) {
		Period p1 = Period.of(1, 1, 1);
		System.out.println(p1); // P1Y1M1D
		
		Period p2 = Period.ofDays(100);
		System.out.println(p2); // P100D
		
		LocalDate ld1 = LocalDate.of(2022, 1, 1);
		LocalDate ld2 = LocalDate.now();
		Period p3 = Period.between(ld1, ld2);
		System.out.println(p3); // P1Y6M14D
		System.out.println(p3.getDays()); // 14

		long numOfDaysInterval = ChronoUnit.DAYS.between(ld1, ld2);
		System.out.println(numOfDaysInterval); // 560
	}

}
