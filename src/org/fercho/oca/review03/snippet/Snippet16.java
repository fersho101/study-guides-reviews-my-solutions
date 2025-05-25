package org.fercho.oca.review03.snippet;

/*
16. Which of these compile when replacing line 8? (Choose all that apply)
7: char[]c = new char[2];
8: // INSERT CODE HERE
A. int length = c.capacity;
B. int length = c.capacity();
C. int length = c.length;
D. int length = c.length();
E. int length = c.size;
F. int length = c.size();
G. None of the above.

A16. C.
 */
public class Snippet16 {
	public static void main(String[] args) {
		char[] c = new char[2];
		// int length = c.capacity;
		// int length = c.capacity();
		int length = c.length; // OK
		// int length = c.length(); // No deberia llevar parentesis.
		// int length = c.size; // 
		// int length = c.size(); //
	}
}
