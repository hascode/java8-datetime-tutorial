package com.hascode.tutorial;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalQuery;

public class Exercises {

	public static void main(String[] args) {
		// it's today, 3 pm in nice, france, what time is it in new york?
		ZonedDateTime nice = ZonedDateTime.now(ZoneId.of("Europe/Paris")).withHour(15).withMinute(0);
		ZonedDateTime ny = nice.withZoneSameInstant(ZoneId.of("US/Eastern"));
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("hh:mm");
		System.out.printf("In Nice it's %s, in New-York it's %s\n", nice.format(fmt), ny.format(fmt));

		// what week day is december 24th in year 3032?
		System.out.printf("december 24th 3032 is week-day: %s\n", LocalDate.of(3032, 12, 24).getDayOfWeek());

		// what week day is the first and last day of the current month?
		LocalDate now = LocalDate.now();
		LocalDate firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
		LocalDate lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.printf("first day of this month is week-day: %s, last day is week-day: %s\n",
				firstDayOfMonth.getDayOfWeek(), lastDayOfMonth.getDayOfWeek());

		// how many days lie between may 23th 1999 and february 12th
		// 2000?
		LocalDate d1 = LocalDate.of(1999, 5, 23);
		LocalDate d2 = LocalDate.of(2000, 2, 12);
		System.out.printf("between %s and %s lie %s days\n", d1, d2, ChronoUnit.DAYS.between(d1, d2));

		// what week day tomorrow in 3 weeks and 1 year?
		DayOfWeek future = LocalDate.now().plusDays(1).plusWeeks(3).plusYears(1).getDayOfWeek();
		System.out.printf("tomorrow in 3 weeks and 1 year it's %s\n", future);

		// convert an instant to a zoneddatetime
		Instant instant = Instant.now();
		ZonedDateTime zdtime = instant.atZone(ZoneId.systemDefault());
		System.out.printf("instant %s as zoned-date-time: %s\n", instant, zdtime);

		// write code to print the length of each month for a range of two given
		// years
		YearMonth from = Year.of(2014).atMonth(Month.JANUARY);
		YearMonth to = Year.of(2017).atMonth(Month.DECEMBER);

		Period oneMonth = Period.ofMonths(1);
		YearMonth cur = YearMonth.from(from);
		while (cur.isBefore(to)) {
			System.out.printf("%s has %s days\n", cur, cur.getMonth().length(true));
			cur = cur.plus(oneMonth);
		}

		// write code detect, if a given date is friday, 13th
		TemporalQuery<Boolean> friday13thQuery = (t) -> {
			return t.get(ChronoField.DAY_OF_MONTH) == 13 && t.get(ChronoField.DAY_OF_WEEK) == 5;
		};

		LocalDate date1 = LocalDate.of(2020, Month.MARCH, 13);
		LocalDate date2 = LocalDate.of(2016, Month.JUNE, 24);
		System.out.printf("%s is friday-13th: %s, %s is friday-13th: %s\n", date1, date1.query(friday13thQuery), date2,
				date2.query(friday13thQuery));

		// read the string 2016/6/23 into a localdate
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/M/dd");
		System.out.printf("formatted date is: %s\n", LocalDate.parse("2016/6/23", format));

	}

}
