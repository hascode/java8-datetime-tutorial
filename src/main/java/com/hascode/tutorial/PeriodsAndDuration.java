package com.hascode.tutorial;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodsAndDuration {

	public static void main(String[] args) {
		LocalDate start = LocalDate.now();
		LocalDate end = start.plusYears(1);
		Period between = Period.between(start, end);
		System.out.println(String.format("between %s and %s are %s days, written as period: %s", start, end,
				ChronoUnit.DAYS.between(start, end), between));

		LocalDateTime startTime = LocalDateTime.now();
		LocalDateTime endTime = startTime.plusMinutes(1);
		Duration duration = Duration.ofMinutes(10);
		System.out.println(String.format("now it's %s, in 10 minutes it's %s", startTime, startTime.plus(duration)));
		System.out.println(String.format("between %s and %s is %s seconds", startTime, endTime,
				Duration.between(startTime, endTime).getSeconds()));
	}

}
