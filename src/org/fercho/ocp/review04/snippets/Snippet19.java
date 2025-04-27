package org.fercho.ocp.review04.snippets;

import java.util.Arrays;

/*
Q19. Which of the following fill in the blank to print a positive integer?

A. compare(s1, s2)

B. mismatch(s1, s2)

C. compare(s3, s4)

D. mismatch(s3, s4)

E. compare(s4, s4)

F.

A19. A, B, D
 */
public class Snippet19 {
	public static void main(String[] args) {
		String[] s1 = { "Camel", "Peacock", "Llama" };
		String[] s2 = { "Camel", "Llama", "Peacock" };
		String[] s3 = { "Camel" };
		String[] s4 = { "Camel", null };
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(Arrays.mismatch(s4, s4));

	}
}
