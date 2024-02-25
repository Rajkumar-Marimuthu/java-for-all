package com.rojatech.ch09.others;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTest {

	public static void main(String[] args) {
		
		String date = LocalDate.parse("2021-03-08").format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);

	}

}

// Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay