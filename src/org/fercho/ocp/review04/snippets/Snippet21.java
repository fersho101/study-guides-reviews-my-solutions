package org.fercho.ocp.review04.snippets;

/*
Wich of the following can fill in the blank to print avaJ?

A.  reverse()

B. append("vaJ$").substring(0, 4);

C. append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1)

D. append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length())

E. None of the above.

A21. A, C.
 */
public class Snippet21 {
	public static void main(String[] args) {

		var puzzle = new StringBuilder("Java");
		puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
		System.out.println(puzzle);
	}
}
