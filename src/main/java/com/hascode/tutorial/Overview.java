package com.hascode.tutorial;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Overview {

	public static void main(String[] args) {

		// just a date, to time, no time-zone, example: my birthday this year
		LocalDate ld = LocalDate.now();
		System.out.println("LocalDate\t:" + ld);

		// just a time, no date, no time-zone, example: midnight
		LocalTime lt = LocalTime.now();
		System.out.println("LocalTime\t:" + lt);

		// date and time without a time-zone, example: midnight on new year's
		// eve
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("LocalDateTime\t:" + ldt);

		// date, time and time-zone specified, example: meeting at 5:00 p.m.
		// CET"
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println("ZonedDateTime\t:" + zdt);

		// a specific moment in time (in GMT time zone)
		Instant i = Instant.now();
		System.out.println("Instant\t\t:" + i);
	}

}
