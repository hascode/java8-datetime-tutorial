package com.hascode.tutorial;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateManipulation {
	public static void main(String[] args) {
		LocalDate xmas = LocalDate.of(2016, Month.DECEMBER, 24);
		System.out.printf("x-mas 2016: %s, week-day: %s\n", xmas, xmas.getDayOfWeek());
		LocalDate xmas2017 = xmas.plusYears(1);
		System.out.printf("x-mas 2017: %s, week-day: %s\n", xmas2017, xmas2017.getDayOfWeek());
		LocalDate xmas1999 = xmas2017.minus(18, ChronoUnit.YEARS);
		System.out.printf("x-mas 1999: %s, week-day: %s\n", xmas1999, xmas1999.getDayOfWeek());

		LocalDate firstNovember1999 = xmas.minusYears(17).minusMonths(1).minusDays(23);
		System.out.printf("first november 1999: %s, week-day: %s\n", firstNovember1999,
				firstNovember1999.getDayOfWeek());
	}

}
