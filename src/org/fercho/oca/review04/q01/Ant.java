package org.fercho.oca.review04.q01;
/* 
1. Which of the following can fill in the blank in this code to make it compile? (Choose all
that apply)
public class Ant {
 _____ void method() { }
}
A. default
B. final
C. private
D. Public
E. String
F. zzz:

A01. B, C
*/

public class Ant {
	private void method() {
		System.out.println("Bien");
	}

	public static void main(String[] args) {
		Ant n = new Ant();
		n.method();
	}
}
