package com.rojatech.ch09.others;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class PepaFormatting {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2023-07-15T12:17:03.4516584
		String formattedDate1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(ldt);
		System.out.println(formattedDate1); // 2023-07-15T12:17:03.4516584
		
		String formattedDate2 = DateTimeFormatter.BASIC_ISO_DATE.format(ldt);
		System.out.println(formattedDate2); // 20230715
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		String formattedDate3 = dtf.format(ldt);
		System.out.println(formattedDate3); // 15-July-2023
		
		String formattedDate4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(ldt);
		System.out.println(formattedDate4); // 15-Jul-2023, 12:47:48 pm
	}

}
