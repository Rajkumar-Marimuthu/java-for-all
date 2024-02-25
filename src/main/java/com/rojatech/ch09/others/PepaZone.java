package com.rojatech.ch09.others;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class PepaZone {

	public static void main(String[] args) {
		
		/*
		 * for (String zoneId : ZoneId.getAvailableZoneIds()) { ZoneId zoneId1 =
		 * ZoneId.of(zoneId); System.out.println(zoneId + " : " +
		 * zoneId1.getDisplayName(TextStyle.FULL, Locale.US)); }
		 */
		
		System.out.println("Number of zones : " + ZoneId.getAvailableZoneIds().size()); // Number of zones : 601

		ZoneId zoneId = ZoneId.of("US/Pacific");
		LocalDateTime ldt = LocalDateTime.now();
		ZonedDateTime zdt1 = ZonedDateTime.of(ldt, zoneId);
		System.out.println(ldt); // 2023-07-15T07:16:07.266377500
		System.out.println(zdt1); // 2023-07-15T07:16:07.266377500-07:00[US/Pacific]
		
		ZonedDateTime zdt2 = ldt.atZone(zoneId);
		System.out.println(zdt2); // 2023-07-15T07:16:07.266377500-07:00[US/Pacific]
		
		ZonedDateTime zdt3 = ZonedDateTime.now();
		System.out.println(zdt3.getZone()); // Europe/London
	}

}
