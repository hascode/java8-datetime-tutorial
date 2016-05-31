package com.hascode.tutorial;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateManipulation {
	public static void main(String[] args) {
		LocalDate xmas = LocalDate.of(2016, Month.DECEMBER, 24);
		System.out.println("x-mas 2016: " + xmas + ", week-day: " + xmas.getDayOfWeek());
		LocalDate xmas2017 = xmas.plusYears(1);
		System.out.println("x-mas 2017: " + xmas2017 + ", week-day: " + xmas2017.getDayOfWeek());
		LocalDate xmas1999 = xmas2017.minus(18, ChronoUnit.YEARS);
		System.out.println("x-mas 1999: " + xmas1999 + ", week-day: " + xmas1999.getDayOfWeek());

		LocalDate firstNovember1999 = xmas.minusYears(17).minusMonths(1).minusDays(23);
		System.out.println(
				"first november 1999: " + firstNovember1999 + ", week-day: " + firstNovember1999.getDayOfWeek());
	}

}
