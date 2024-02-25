package com.rojatech.ch09.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		Double d = 23563567.3456;
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf);
		System.out.println(nf.format(d));
		
		NumberFormat ff = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println(ff);
		System.out.println(ff.format(d));
		
		NumberFormat usf = NumberFormat.getInstance(Locale.US);
		System.out.println(usf);
		System.out.println(usf.format(d));
		
		NumberFormat ukf = NumberFormat.getInstance(Locale.UK);
		System.out.println(ukf);
		System.out.println(ukf.format(d));
		
		NumberFormat inf = NumberFormat.getInstance(new Locale("en", "IN"));
		System.out.println(inf);
		System.out.println(inf.format(d));
	}

}
