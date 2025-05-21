package org.fercho.oca.review03.snippet;

/*
 * A05. F
 */

public class Snippet05 {
	public static void main(String[] args) {
		String s1 = "java";
		StringBuilder s2 = new StringBuilder("java");
		// if(s1 == s2) System.out.println("1"); // tipos incompatibles
		if(s1.equals(s2)) System.out.println("2");
		// else System.out.println("nop");
	}
}
