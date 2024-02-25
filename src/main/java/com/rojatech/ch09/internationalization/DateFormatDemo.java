package com.rojatech.ch09.internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		Date d = new Date();
		DateFormat usdf = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		DateFormat ukdf = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
		System.out.println(usdf.format(d));
		System.out.println(ukdf.format(d));
		
		DateFormat ustf = DateFormat.getTimeInstance(DateFormat.LONG, Locale.US);
		DateFormat uktf = DateFormat.getTimeInstance(DateFormat.LONG, Locale.UK);
		System.out.println(ustf.format(d));
		System.out.println(uktf.format(d));
		
		DateFormat usdtf = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.US);
		DateFormat ukdtf = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.UK);
		System.out.println(usdtf.format(d));
		System.out.println(ukdtf.format(d));
		
	}

}
