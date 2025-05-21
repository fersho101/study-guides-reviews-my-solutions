package org.fercho.oca.review03.snippet;

/*
What is the result of the following code?
		StringBuilder b = "rumble";
		b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
		System.out.println(b);
A. rum
B. rum4
C. rumb4
D. rumble4
E. An exception is thrown.
F. The code does not compile.

A13. E, F.
 */
public class Snippet13 {
	public static void main(String[] args) {
		// StringBuilder b = "rumble";
		StringBuilder b = new StringBuilder("rumble");
		b.append(4).deleteCharAt(3).delete(3, b.length()-1); // rumble4 -> rumle4 -> rum4
		System.out.println(b);
	}
}
