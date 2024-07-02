package com.rojatech.ch09.others;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {

	public static void main(String[] args) {
		
		String date = LocalDate.parse("2021-03-08").format(DateTimeFormatter.ISO_DATE);
		System.out.println(date);

	}

}
