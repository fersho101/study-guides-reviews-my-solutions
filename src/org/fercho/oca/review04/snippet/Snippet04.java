package org.fercho.oca.review04.snippet;

/*
4. Which of the following compile? (Choose all that apply)
A. public void moreA(int... nums) {}
B. public void moreB(String values, int... nums) {}
C. public void moreC(int... nums, String values) {}
D. public void moreD(String... values, int... nums) {}
E. public void moreE(String[] values, ...int nums) {}
F. public void moreF(String... values, int[] nums) {}
G. public void moreG(String[] values, int[] nums) {}

A04. A, B, G.
 */
public class Snippet04 {

	public void moreA(int... nums) {
	}

	public void moreB(String values, int... nums) {
	}

	// Ubicacion del argumento invalido, deberia ser el ultimo elemento.
	// public void moreC(int... nums, String values) {
	// }

	// Solo debe existir un parametro varArgs por metodo
	// public void moreD(String... values, int... nums) {
	// }

	// Invalida sintaxis seria "int..."
	// public void moreE(String[] values, ...int nums) {}

	// Invalida ubicacion de varargs, tienen que ser el ultimo parametro.
	// public void moreF(String... values, int[] nums) {
	// }

	public void moreG(String[] values, int[] nums) {
	}
}
