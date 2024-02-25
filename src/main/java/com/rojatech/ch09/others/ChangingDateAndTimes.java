package com.rojatech.ch09.others;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class ChangingDateAndTimes {

	public static void main(String[] args) {
		LocalDateTime ldt1 = LocalDateTime.of(2023, 2, 25, 8, 0);
		System.out.println(ldt1); // 2023-02-25T08:00
		
		LocalDateTime ldt2 = ldt1.plusDays(6);
		System.out.println(ldt2); // 2023-03-03T08:00
		
		LocalDateTime ldt3 = ldt1.withMonth(9);
		System.out.println(ldt3); // 2023-09-25T08:00
		
		LocalDateTime ldt4 = ldt1.plus(Period.ofWeeks(1));
		System.out.println(ldt4); // 2023-03-04T08:00
		
		LocalDateTime ldt5 = ldt1.minus(Duration.ofHours(4));
		System.out.println(ldt5); // 2023-02-25T04:00
	}

}
