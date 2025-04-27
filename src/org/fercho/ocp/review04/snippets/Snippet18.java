package org.fercho.ocp.review04.snippets;

/*
Q18. What is the result of the following code?

A. 2

B. 4

C. 7

D. 10

E. ==

F. equals

G. An exceptions is thrown.

H. The code does not compile.

A18. F
 */
public class Snippet18 {
	public static void main(String[] args) {

		String s1 = """
				purr""";				
		String s2 = "";

		s1.toUpperCase();
		s1.trim();
		s1.substring(1, 3);
		s1 += "two";

		s2 += 2;
		s2 += 'c';
		s2 += false;

		if (s2 == "2cfalse")
			System.out.println("==");
		if (s2.equals("2cfalse"))
			System.out.println("equals");
		System.out.println(s1.length());
		System.out.println(s1);

	}
}
