package org.fercho.ocp.review04.snippets;

/*
Q16. What is included in the output of the following code?

A. 10

B. 11

C. 12

D. 13

E. 14

F. 15

G. 16

A16.  A, B, G.
 */
public class Snippet16 {
	public static void main(String[] args) {

		var base = "ewe\nsheep\\t";
		int length = base.length(); // 11
		int indent = base.indent(2).length(); //16
		int translate = base.translateEscapes().length(); //10

		var formatted = "%s %s %s".formatted(length, indent, translate);
		System.out.format(formatted);
	}

}
