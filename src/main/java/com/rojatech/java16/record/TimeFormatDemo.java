package com.rojatech.java16.record;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatDemo {

	public static void main(String[] args) {
		LocalTime lt =  LocalTime.parse("17:30:09.123456");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");
		System.out.println(lt.format(formatter));
		
	}

}
