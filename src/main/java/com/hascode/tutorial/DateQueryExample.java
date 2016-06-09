package com.hascode.tutorial;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;
import java.time.temporal.TemporalUnit;

public class DateQueryExample {

	public static void main(String[] args) {
		TemporalQuery<TemporalUnit> query = TemporalQueries.precision();
		System.out.printf("LocalDate precision: %s%n", LocalDate.now().query(query));
		System.out.printf("LocalDateTime precision: %s%n", LocalDateTime.now().query(query));
		System.out.printf("Year precision: %s%n", Year.now().query(query));
		System.out.printf("YearMonth precision: %s%n", YearMonth.now().query(query));
		System.out.printf("Instant precision: %s%n", Instant.now().query(query));

		LocalDate date = LocalDate.of(2016, 11, 22);
		boolean isInYear2016 = date.query(t -> {
			return t.get(ChronoField.YEAR) == 2016;
		});
		System.out.printf("date %s is in year 2016: %s\n", date, isInYear2016);
	}

}
