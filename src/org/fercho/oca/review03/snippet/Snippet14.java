package org.fercho.oca.review03.snippet;

/*
14. Which of the following can replace line 4 to print "avaJ"? (Choose all that apply)
3: StringBuilder puzzle = new StringBuilder("Java");
4: // INSERT CODE HERE
5: System.out.println(puzzle);
A. puzzle.reverse();
B. puzzle.append("vaJ$").substring(0, 4);
C. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
D. puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
E. None of the above.

A14. A, D
 */
public class Snippet14 {
	public static void main(String[] args) {
		StringBuilder puzzle = new StringBuilder("Java");
		// puzzle.reverse();
		puzzle.append("vaJ$").substring(0, 4); // JavavaJ$ -> Java
		// puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1); // JavavaJ$ -> avaJ$ -> avaJ
		// puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length()); // Java -> avaJ$ -> exception
		System.out.println(puzzle);
	}
}
