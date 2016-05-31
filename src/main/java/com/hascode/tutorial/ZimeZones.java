package com.hascode.tutorial;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZimeZones {

	public static void main(String[] args) {
		ZoneId.getAvailableZoneIds().stream().filter(z -> z.contains("Europe")).sorted().forEach(System.out::println);

		ZoneId easternUs = ZoneId.of("US/Eastern");
		ZonedDateTime timeInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("In Paris, it's " + timeInParis);
		ZonedDateTime timeInNY = timeInParis.withZoneSameInstant(easternUs);
		System.out.println("Meanwhile in New York, it's: " + timeInNY);
	}

}
