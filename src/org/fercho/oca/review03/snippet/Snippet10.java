package org.fercho.oca.review03.snippet;

/*
10. What is the result of the following code? (Choose all that apply)

		13: String a = "";
		14: a += 2;
		15: a += 'c';
		16: a += false;
		17: if ( a == "2cfalse") System.out.println("==");
		18: if ( a.equals("2cfalse")) System.out.println("equals");

A. Compile error on line 14.
B. Compile error on line 15.
C. Compile error on line 16.
D. Compile error on another line.
E. ==
F. equals
G. An exception is thrown.

A10. F
 */

public class Snippet10 {
	public static void main(String[] args) {
		String a = "";
		a += 2; // "2"
		a += 'c'; // "2c"
		a += false; // "2cfalse"
		if (a == "2cfalse")
			System.out.println("==");
		if (a.equals("2cfalse"))
			System.out.println("equals");
	}
}
