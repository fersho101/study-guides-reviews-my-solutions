package org.fercho.ocp.review04.snippets;

/*
Q17. Which of these statements are true?

A. letters.substring(1,2) returns a single.character String.

B. letters.substring(2,2) return a single-character String.

C. letters.substring(6,5) return a single-character String.

D. letters.substring(6,6) return a single-character String.

E. letters.substring(1,2) throws an exception.

F. letters.substring(2,2) throws an exception.

G. letters.substring(6,5) throws an exception.

H. letters.substring(6,6) throws an exception.

A17. A, G.
 */
public class Snippet17 {

	public static void main(String[] args) {
		var letters = new StringBuilder("abcdefg");

		System.out.println(letters.substring(1, 2)); // b
		System.out.println(letters.substring(2, 2)); // blank line
		// System.out.println(letters.substring(6,5)); // Exception
		System.out.println(letters.substring(1, 2)); //
		System.out.println(letters.substring(2, 2)); // blank line
		// System.out.println(letters.substring(6,5)); // Exception
		System.out.println(letters.substring(6, 6)); // blank line

		System.out.println("fin");
	}

}
