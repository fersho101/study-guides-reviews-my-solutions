package org.fercho.ocp.review04.snippets.q13;

/*
Q13. What is the result of the following code?

A. roar roar

B. roar roar!!! -> String es inmutable. 

C. roar!!! roar

D. roar!!! roar!!!

E. An exception is thrown.

D. The code does not compile.

A13. 
 */
public class Lion {
	public void roar(String roar1, StringBuilder roar2) {
		roar1.concat("!!!");
		roar2.append("!!!");
	}

	public static void main(String[] args) {
		var roar1 = "roar";
		var roar2 = new StringBuilder("roar");
		new Lion().roar(roar1, roar2);
		System.out.println(roar1 + " " + roar2); 
	}
}
