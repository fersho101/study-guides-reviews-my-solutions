package org.fercho.oca.review04.snippet;

/*
5. Given the following method, which of the method calls return 2? (Choose all that apply)
public int howMany(boolean b, boolean... b2) {
 return b2.length;
}
A. howMany();
B. howMany(true);
C. howMany(true, true);
D. howMany(true, true, true);
E. howMany(true, {true});
F. howMany(true, {true, true});
G. howMany(true, new boolean[2]);

A05. D, G.
 */
public class Snippet05 {

	public int howMany(boolean b, boolean... b2) {
		return b2.length;
	}

	public static void main(String[] args) {
		Snippet05 s = new Snippet05();
		System.out.println(s.howMany(true, new boolean[2]));
	}
}
