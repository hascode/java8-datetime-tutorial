package com.hascode.tutorial;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LegacyApiInteroperability {
	public static void main(String[] args) {
		// Date to Instant
		Date date1 = new Date();
		Instant inst1 = date1.toInstant();
		System.out.printf("date %s to instant %s\n", date1, inst1);

		// Date from Instant
		Date date2 = Date.from(inst1);
		System.out.printf("date %s from instant %s equals date %s: %s\n", date2, inst1, date1, date1.equals(date2));

		// Calendar to Instant
		Calendar cal1 = Calendar.getInstance();
		Instant inst2 = cal1.toInstant();
		// i hate calendar's toString so much
		System.out.printf("calendar %s to instant %s\n", cal1, inst2);

		// gregorian calendar from zoned datetime
		ZonedDateTime zdt1 = ZonedDateTime.now();
		GregorianCalendar gcal1 = GregorianCalendar.from(zdt1);
		System.out.printf("calendar %s from zoned-date-time %s\n", gcal1, zdt1);

		// gregorian calendar to zoned datetime
		ZonedDateTime zdt2 = gcal1.toZonedDateTime();
		System.out.printf("converted zoned date-times equal: %s\n", (zdt1.equals(zdt2)));

		// TimeZone from ZoneId
		ZoneId zoneId1 = ZoneId.of("Europe/Berlin");
		TimeZone tz = TimeZone.getTimeZone(zoneId1);
		System.out.printf("time-zone from zone-id %s is %s\n", zoneId1, tz);

		// java.sql.Date to LocalDate
		java.sql.Date sqlDate = new java.sql.Date(date1.getTime());
		LocalDate ld = sqlDate.toLocalDate();
		System.out.printf("sql-date %s to localdate is: %s\n", sqlDate, ld);

		// be careful .. a sql.Date has no time component so this will throw an
		// exception
		try {
			Instant inst3 = sqlDate.toInstant();
		} catch (UnsupportedOperationException e) {
			System.out.println("conversion of java.util.Date to Instant is not possible");
			Instant inst3 = Instant.ofEpochMilli(sqlDate.getTime());
			System.out.printf("sql.Date %s to Instant using Instant.ofEpochMilli is: %s\n", sqlDate, inst3);
		}
	}
}
