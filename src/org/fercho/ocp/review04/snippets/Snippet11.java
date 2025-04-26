package org.fercho.ocp.review04.snippets;

import java.time.LocalDate;

/*
Q11. What is the output of the following code?

A. 2022 MARCH 4

B. 2022 MARCH 6

C. 2022 APRIL 3

D. 2022 APRIL 5

E. The code does not compile.

F. A runtime exception is thrown.

A11. E. Existen 1 error.  A un date no se le puede agregar horas.
 */
public class Snippet11 {

	public static void main(String[] args) {
		var date = LocalDate.of(2022, 4, 3);
		date.plusDays(2);
		// date.plusHours(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

	}

}
