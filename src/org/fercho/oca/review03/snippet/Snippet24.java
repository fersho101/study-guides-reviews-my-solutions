package org.fercho.oca.review03.snippet;

// import java.util.List;

/*
24. What is the result of the following?
6: String [] names = {"Tom", "Dick", "Harry"};
7: List<String> list = names.asList();
8: list.set(0, "Sue");
9: System.out.println(names[0]);
A. Sue
B. Tom
C. Compiler error on line 7.
D. Compiler error on line 8.
E. An exception is thrown.
A24. C, tipo Array no tiene asList().
 */
public class Snippet24 {
	public static void main(String[] args) {
		String[] names = { "Tom", "Dick", "Harry" };
		// List<String> list = names.asList();
		// list.set(0, "Sue");
		System.out.println(names[0]);
	}
}
