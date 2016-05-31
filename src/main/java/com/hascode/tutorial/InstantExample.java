package com.hascode.tutorial;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantExample {
	public static void main(String[] args) throws Exception {
		// measuring time of execution
		Instant start = Instant.now();
		Thread.sleep(2000); // simulate operation
		Instant stop = Instant.now();
		System.out.println(String.format("operation started at %s, ended at %s, took %s seconds", start, stop,
				Duration.between(start, stop).getSeconds()));

		// converting instant to zoned date-time
		Instant now = Instant.now();
		ZonedDateTime berlin = ZonedDateTime.ofInstant(now, ZoneId.of("Europe/Berlin"));
		System.out.println(String.format("instant: %s, berlin: %s", now, berlin));
		Instant berlinInstant = berlin.toInstant();
		System.out.println("instants are equal: " + now.equals(berlinInstant));
	}
}
