package org.fercho.oca.review03.snippet;

/*
11. What is the result of the following code?
		4: int total = 0;
		5: StringBuilder letters = new StringBuilder("abcdefg");
		6: total += letters.substring(1, 2).length();
		7: total += letters.substring(6, 6).length();
		8: total += letters.substring(6, 5).length();
		9: System.out.println(total);
A. 1
B. 2
C. 3
D. 7
E. An exception is thrown.
F. The code does not compile.

A11. E, F. Eliminando la line 8, imprime 1.
 */
public class Snippet11 {
	public static void main(String[] args) {
		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		total += letters.substring(1, 2).length(); // 1
		total += letters.substring(6, 6).length(); // 1
		// total += letters.substring(6, 5).length(); // exception
		System.out.println(total); 
	}

}
