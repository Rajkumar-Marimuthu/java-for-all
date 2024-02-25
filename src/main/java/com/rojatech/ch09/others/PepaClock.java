package com.rojatech.ch09.others;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class PepaClock {
	public static void main(String[] args) {
		Clock clock = Clock.systemDefaultZone(); 
		System.out.println(clock); // SystemClock[Europe/London]
		
		Instant instant = clock.instant();
		System.out.println(instant); // 2023-07-15T08:28:27.698668900Z
		
		Clock clock1 = Clock.systemUTC();
		System.out.println(clock1.instant()); // 2023-07-15T08:28:27.716084400Z
		
		Clock clock2 = Clock.offset(clock1, Duration.ofHours(10));
		System.out.println(clock2.instant()); // 2023-07-15T18:28:27.717092900Z
		
	}

}
