package org.fercho.ocp.review04.snippets;

import java.util.Arrays;

/*
Q15. What is the output of the following?

A. [pog, PIG, 123]

B. [PIG, pig, 123]

C. [123, PIG, pig] -> primero numeros, mayuscculas, minusculas

D. [123, pig, PIG]

E. -3

F. -2

G. The result of the binarySearch() are undefined in this example.

A15. C, E.
 */
public class Snippet15 {
	public static void main(String[] args) {
		var arr = new String[] { "PIG", "pig", "123" };

		Arrays.sort(arr);		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, "Pipa"));
	}
}
