package org.fercho.ocp.review04.snippets;

import java.time.LocalDate;
import java.time.Month;

/*
Q22. What is the output of the following code?

A. 2022 APRIL 30

B. 2022 MAY 2

C. 2025 APRIL 2

D. 2025 APRIL 30

E. 2025 MAY 2

F. The code does not compile.

G. A runtime exception is thrown.

A22. A

 */
public class Snippet22 {
	public static void main(String[] args) {
		var date = LocalDate.of(2022, Month.APRIL, 30);
		date.plusDays(2); // el resultado no es gurdado
		date.plusYears(3);// el resultado no es gurdado
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth()); // Se llaman los
																									// valores de date

		System.out.println("***");
		System.out.println(date.plusDays(2));
		System.out.println(date.plusYears(3));
	}
}
