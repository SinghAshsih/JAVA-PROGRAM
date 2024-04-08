package com.program.ashish.conversion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class StringToDate {
	public static void main(String[] args) {
		String date = "2202-09-22";
		LocalDate lo = LocalDate.parse(date);
		System.out.println(lo);
		String dateTime = "2018-05-05T11:50:55";
		LocalDateTime dt = LocalDateTime.parse(dateTime);
		System.out.println(dt);

		// It is important to note that both the LocalDate and LocalDateTime objects are
		// timezone agnostic.
		// However, when we need to deal with time zone specific dates and times,
		// we can use the ZonedDateTime parse method directly to get a time zone
		// specific date time
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
		ZonedDateTime zonedDateTime = ZonedDateTime.parse("15-02-2024 10:15:30 Europe/Paris", formatter);
		System.out.println(zonedDateTime);

		// Using the Parse API With a Custom Formatter

		String dateInString = "19590709";
		LocalDate datee = LocalDate.parse(dateInString, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(datee);

	}
}
