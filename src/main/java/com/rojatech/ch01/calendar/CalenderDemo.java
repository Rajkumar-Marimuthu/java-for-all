package com.rojatech.ch01.calendar;

import java.util.Calendar;

public class CalenderDemo {

    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        final String weekday = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, java.util.Locale.US);
        return weekday.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(CalenderDemo.findDay(8, 5, 2015));
    }
}
