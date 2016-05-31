package com.hascode.tutorial;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Arrays;

public class Enums {

	public static void main(String[] args) {
		// months
		System.out.println("Months\t:" + Arrays.toString(Month.values()));

		// days of week
		System.out.println("Days\t:" + Arrays.toString(DayOfWeek.values()));
	}

}
