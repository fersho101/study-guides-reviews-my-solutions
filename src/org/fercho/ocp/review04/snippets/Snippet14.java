package org.fercho.ocp.review04.snippets;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
Q14. Given the following, which can correctly fill int the blank?

A. Instant.now()

B. new Instant()

C. date.toInstance();

D. dateTime.toInstance();

E. time.toInstance();

F. zonedDateTime.toInstance();

A14. A, F.
 */
public class Snippet14 {
	public static void main(String[] args) {

		var date = LocalDate.now();
		var time = LocalTime.now();
		var dateTime = LocalDateTime.now();
		var zoneId = ZoneId.systemDefault();
		var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
		Instant instant = zonedDateTime.toInstant();

		System.out.println(date);
		System.out.println(time);

		System.out.println(instant);

	}
}
