package com.hascode.tutorial;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterExamples {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, Month.DECEMBER, 24);

		final LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.printf("first day of december 2016: %s (%s)\n", firstDay, firstDay.getDayOfWeek());

		final LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.printf("last day of december 2016: %s (%s)\n", lastDay, lastDay.getDayOfWeek());

		System.out.printf("first monday of december 2016: %s\n",
				date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));

		System.out.printf("last monday of december 2016: %s\n",
				date.with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY)));

		// custom temporal adjuster
		LocalDateTime ldt = LocalDateTime.now();
		System.out.printf("%s with custom adjuster is %s", ldt, ldt.with(new ZeroBCYearAdjuster()));
	}

	static class ZeroBCYearAdjuster implements TemporalAdjuster {
		@Override
		public Temporal adjustInto(Temporal temporal) {
			return LocalDateTime.from(temporal).withYear(0);
		}

	}
}
