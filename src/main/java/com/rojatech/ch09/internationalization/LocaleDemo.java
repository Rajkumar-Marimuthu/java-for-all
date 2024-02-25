package com.rojatech.ch09.internationalization;

import java.util.Arrays;
import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		Locale loc = Locale.getDefault();
		System.out.println(loc.getCountry());
		System.out.println(loc.getDisplayCountry());
		System.out.println(loc.getDisplayLanguage());
		System.out.println(loc.getDisplayScript());
		System.out.println(loc.getLanguage());
		
		String[] countries = loc.getISOCountries();
		for (String string : countries) {
			System.out.println(string);
		}
		System.out.println(Arrays.stream(loc.getISOCountries()).count());
		Arrays.stream(loc.getISOLanguages()).forEach(System.out::println);
		
	}

}
