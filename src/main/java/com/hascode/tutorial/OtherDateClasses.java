package com.hascode.tutorial;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import java.util.Arrays;

public class OtherDateClasses {
	public static void main(String[] args) {
		// Year class and leap year detection
		System.out.println("1900 is leap year: " + Year.of(1900).isLeap());
		System.out.println("2012 is leap year: " + Year.isLeap(2012));

		// enum classes
		System.out.println("Months\t:" + Arrays.toString(Month.values()));
		System.out.println("Days\t:" + Arrays.toString(DayOfWeek.values()));
	}
}
