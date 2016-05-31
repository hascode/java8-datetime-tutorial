package com.hascode.tutorial;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class ClockExample {
	public static void main(String[] args) throws Exception {
		Clock clock = Clock.systemDefaultZone();
		System.out.println(clock.millis());
		Thread.sleep(1234);
		System.out.println(clock.millis());

		System.out.println("timeless clock (always returns the same instant)");
		Clock timeless = Clock.fixed(Instant.now(), ZoneId.of("Europe/Berlin"));
		System.out.println(timeless.millis());
		Thread.sleep(1234);
		System.out.println(timeless.millis());
		Thread.sleep(1234);
		System.out.println(timeless.millis());
	}
}
