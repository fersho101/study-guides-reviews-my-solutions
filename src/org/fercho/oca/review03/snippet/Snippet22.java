package org.fercho.oca.review03.snippet;

import java.util.Arrays;

/*
22. What is the result of the following?
int[] random = { 6, -4, 12, 0, -10 };
int x = 12;
int y = Arrays.binarySearch(random, x);
System.out.println(y);
A. 2
B. 4
C. 6
D. The result is undefined.
E. An exception is thrown.
F. The code does not compile.

A22. D
 */
public class Snippet22 {
	public static void main(String[] args) {
		int[] random = {112, -4, 12, 0, -10};
		// Arrays.sort(random);
		// System.out.println(Arrays.toString(random));
		int x = 12;
		int y = Arrays.binarySearch(random, x);
		System.out.println(y);
	}
}
