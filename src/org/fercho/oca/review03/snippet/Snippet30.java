package org.fercho.oca.review03.snippet;

import java.time.LocalDate;
import java.time.Month;

/*
30. What is the output of the following code?
LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
System.out.println(date.getYear() + " " + date.getMonth() + " "
+ date.getDayOfMonth());
A. 2018 APRIL 4
B. 2018 APRIL 30
C. 2018 MAY 10
D. Another date.
E. The code does not compile.
F. A runtime exception is thrown.

A30. F. No exite dia 40 en ningun mes del año.
 */
public class Snippet30 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
	}
}
