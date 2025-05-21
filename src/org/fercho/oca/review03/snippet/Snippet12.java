package org.fercho.oca.review03.snippet;

/*
12. What is the result of the following code? (Choose all that apply)
		StringBuilder numbers = new StringBuilder("0123456789");
		numbers.delete(2, 8);
		numbers.append("-").insert(2, "+");
		System.out.println(numbers);
A. 01+89–
B. 012+9–
C. 012+–9
D. 0123456789
E. An exception is thrown.
F. The code does not compile.

A12. A.
 */

public class Snippet12 {

	public static void main(String[] args) {
		StringBuilder numbers = new StringBuilder("0123456789");
		numbers.delete(2, 8); // "0189"
		numbers.append("-").insert(2, "+"); // "01+89-"
		System.out.println(numbers);
	}

}
