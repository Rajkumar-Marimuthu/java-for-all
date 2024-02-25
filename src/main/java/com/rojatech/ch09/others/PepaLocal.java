package com.rojatech.ch09.others;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;

// Shall we check Java 8 features especially using built-in functional interface?
public class PepaLocal {

	public static void main(String[] args) {
		System.out.println("Pepa..");
		LocalDate ld1 = LocalDate.now(); 
		LocalDate ld2 = LocalDate.of(2023, 7, 14);
		LocalDate ld3 = LocalDate.of(2023, Month.JULY, 14);
		System.out.println(ld1 + ", " + ld2 + ", " + ld3); // 2023-07-14, 2023-07-14, 2023-07-14
		
		// invalid date
		// LocalDate ld4 = LocalDate.of(2023, 13, 14); 
		// Exception in thread "main" java.time.DateTimeException: Invalid value for MonthOfYear (valid values 1 - 12): 13
		
		LocalTime lt1 = LocalTime.now();
		LocalTime lt2 = LocalTime.of(18, 0);
		System.out.println(lt1 + ", " + lt2); // 20:01:23.007053200, 18:00
		
		LocalDateTime ldt1 = LocalDateTime.now();
		LocalDateTime ldt2 = LocalDateTime.of(2025,6,23,23,00);
		System.out.println(ldt1 + ", " + ldt2); // 2023-07-14T20:01:23.007053200, 2025-06-23T23:00
		
		MonthDay md1 = MonthDay.now();
		System.out.println(md1); // --07-14
		LocalDate ld4 = md1.atYear(2023);
		System.out.println(ld4); // 2023-07-14
		
		YearMonth ym1 = YearMonth.now();
		System.out.println(ym1); // 2023-07
		LocalDate ld5 = ym1.atDay(3);
		System.out.println(ld5); // 2023-07-03
	}
}
