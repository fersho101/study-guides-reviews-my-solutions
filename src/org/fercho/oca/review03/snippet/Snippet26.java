package org.fercho.oca.review03.snippet;

import java.util.ArrayList;
import java.util.List;

/*
26. Which of the following are true statements about the following code? (Choose all that
apply)
4: List<Integer> ages = new ArrayList<>();
5: ages.add(Integer.parseInt("5"));
Review Questions 161
6: ages.add(Integer.valueOf("6"));
7: ages.add(7);
8: ages.add(null);
9: for (int age : ages) System.out.print(age);
A. The code compiles.
B. The code throws a runtime exception.
C. Exactly one of the add statements uses autoboxing.
D. Exactly two of the add statements use autoboxing.
E. Exactly three of the add statements use autoboxing.

A26. A, B, D.
 */
public class Snippet26 {
	public static void main(String[] args) {

		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5"));
		ages.add(Integer.valueOf("6"));
		ages.add(7);
		// ages.add(null);
		for (int age : ages)
			System.out.print(age);
	}
}
