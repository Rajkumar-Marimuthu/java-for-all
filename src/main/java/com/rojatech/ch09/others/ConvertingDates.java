package com.rojatech.ch09.others;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class ConvertingDates {

	public static void main(String[] args) {
		Date date = new Date(2022,5,10);
		LocalDateTime ldt = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println(ldt);
		
		Calendar calendar = Calendar.getInstance();
		LocalDateTime ldt2 = calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println(ldt2);
	}

}
