package com.rojatech.ch03.java8.streams;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate localDate2 = LocalDate.of(2021, 12, 3);
		LocalDate localDate3 = LocalDate.parse("2021-11-15");
		LocalDate tomorrow = today.plusDays(1);
		DayOfWeek dayOfWeek = today.getDayOfWeek();
		LocalDate prevMonthSameDay = today.minus(1,ChronoUnit.MONTHS);
		LocalDate prev3MonthSameDay = today.minus(3,ChronoUnit.MONTHS);
		LocalDateTime beginningOfDay = today.atStartOfDay();
		LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
		LocalTime now = LocalTime.now();
		LocalTime sixThirty = LocalTime.parse("06:30");
		LocalTime sevenThiry = LocalTime.of(7, 30);
		
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		
		System.out.println(today);
		System.out.println(localDate2);
		System.out.println(localDate3);
		System.out.println(tomorrow);
		System.out.println(dayOfWeek);
		System.out.println(prevMonthSameDay);
		System.out.println(prev3MonthSameDay);
		System.out.println(beginningOfDay);
		System.out.println(firstDayOfMonth);
		System.out.println(now);
		System.out.println(sixThirty);
		System.out.println(sevenThiry);
		System.out.println(allZoneIds);
	}

}
