package org.fercho.ocp.review04.snippets;

/*
Q12. What is the output by the following code?

A. 12

B. 123

C. 7

D. 78

E. A blank line.

F. The code does not compile.

E. An exception is thrown.

A12. A, D, E.
 */
public class Snippet12 {
	public static void main(String[] args) {
		var numbers = "012345678";
		numbers = numbers.stripLeading();
		System.out.println(numbers.substring(1, 3)); //"12"
		System.out.println(numbers.substring(7, 7)); // A blank line
		System.out.print(numbers.substring(7));//"78"
	}
}
