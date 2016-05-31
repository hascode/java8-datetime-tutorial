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
		System.out.printf("between %s and %s are %s days, written as period: %s\n", start, end,
				ChronoUnit.DAYS.between(start, end), between);

		LocalDateTime startTime = LocalDateTime.now();
		LocalDateTime endTime = startTime.plusMinutes(1);
		Duration duration = Duration.ofMinutes(10);
		System.out.printf("now it's %s, in 10 minutes it's %s\n", startTime, startTime.plus(duration));
		System.out.printf("between %s and %s is %s seconds\n", startTime, endTime,
				Duration.between(startTime, endTime).getSeconds());
	}

}
