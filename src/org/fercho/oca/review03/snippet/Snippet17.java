package org.fercho.oca.review03.snippet;

import java.util.ArrayList;

/*
17. Which of these compile when replacing line 8? (Choose all that apply)
7: ArrayList l = new ArrayList();
8: // INSERT CODE HERE
A. int length = l.capacity;
B. int length = l.capacity();
C. int length = l.length;
D. int length = l.length();
E. int length = l.size;
F. int length = l.size();
G. None of the above.
 */
public class Snippet17 {
	public static void main(String[] args) {
		ArrayList l = new ArrayList<>();
		// int length = l.capacity;
		// int length = l.capacity();
		// int length = l.length;
		// int length = l.length();
		// int length = l.size;
		int length = l.size(); // OK
	}
}
