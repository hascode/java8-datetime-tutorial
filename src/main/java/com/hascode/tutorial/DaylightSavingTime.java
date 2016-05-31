package com.hascode.tutorial;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DaylightSavingTime {
	public static void main(String[] args) {
		ZonedDateTime winterTime = ZonedDateTime.of(2016, 3, 27, 1, 0, 0, 0, ZoneId.of("Europe/Berlin"));
		System.out.println("DST change in Germany from winter to summer time, it's " + winterTime);
		System.out.println("After adding one hour, it's now " + winterTime.plusHours(2));
	}
}
