package com.hascode.tutorial;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class HelperMethods {
	public static void main(String[] args) {
		// Year class and leap year detection
		System.out.println("1900 is leap year: " + Year.of(1900).isLeap());
		System.out.println("2012 is leap year: " + Year.isLeap(2012));

		// length of year
		System.out.println("length of year 2016: " + Year.of(2016).length());
		System.out.println("length of year 2016: " + Year.of(2017).length());

		// Month day validity checking
		System.out.println("Feb 29 is valid for 2016: " + MonthDay.of(Month.FEBRUARY, 29).isValidYear(2016));
		System.out.println("Feb 29 is valid for 2017: " + MonthDay.of(Month.FEBRUARY, 29).isValidYear(2017));

	}
}
