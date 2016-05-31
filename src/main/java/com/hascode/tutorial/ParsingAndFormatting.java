package com.hascode.tutorial;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsingAndFormatting {
	public static void main(String[] args) {
		// formatting
		LocalDate ld = LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yy/MM/dd");
		System.out.printf("%s formatted is %s\n", ld, ld.format(format));

		// parsing
		String dateString = "13/12/24";
		LocalDate parsed = LocalDate.parse(dateString, format);
		System.out.printf("string %s parsed to local-date %s\n", dateString, parsed);
	}
}
