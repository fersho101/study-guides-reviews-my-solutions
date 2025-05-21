package org.fercho.oca.review03.snippet.q06;

/*
 * A06. B
 */

public class Lion {
	public void roar(String roar1, StringBuilder roar2) {
		// String g = roar1.concat("!!!");
		roar1.concat("!!!");
		roar2.append("!!!");

		System.out.println(roar1 + " - " + roar2);
	}

	public static void main(String[] args) {
		String roar1 = "roar";
		StringBuilder roar2 = new StringBuilder("roar");
		new Lion().roar(roar1, roar2);
		System.out.println(roar1 + " " + roar2);
	}
}
