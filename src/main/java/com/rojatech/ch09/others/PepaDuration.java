package com.rojatech.ch09.others;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class PepaDuration {

	public static void main(String[] args) {
		Duration d1 = Duration.of(1, ChronoUnit.DAYS);
		System.out.println(d1); // PT24H
		
		Duration d2 = Duration.of(5, ChronoUnit.HOURS);
		System.out.println(d2); // PT5H
		
		LocalTime lt1 = LocalTime.now();
		LocalTime lt2 = LocalTime.of(15, 0);
		System.out.println(Duration.between(lt1, lt2)); // PT1H40M53.7159466S
		
		/*
		 * Duration d3 = Duration.of(1, ChronoUnit.MONTHS); System.out.println(d3);
		 */
		//Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration
	}

}
