package com.rojatech.ch09.internationalization;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/y hh:mm:ss");
		String date = sdf.format(new Date());
		System.out.println(date);
		
		String date1 = "10-12-2014";
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yyyy");
		try {
			Date date2 = sdf1.parse(date1);
			System.out.println(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		}
}
