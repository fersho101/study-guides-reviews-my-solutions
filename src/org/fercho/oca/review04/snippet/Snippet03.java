package org.fercho.oca.review04.snippet;

/*
3. Which of the following methods compile? (Choose all that apply)
A. public void methodA() { return;}
B. public void methodB() { return null;}
C. public void methodD() {}
D. public int methodD() { return 9;}
E. public int methodE() { return 9.0;}
F. public int methodF() { return;}
G. public int methodG() { return null;}

A03. A, C, D.

 */
public class Snippet03 {
	public void methodA() {
		return;
	}

	// Valor de retorno invalido
	// public void methodB() {
	// return null;
	// }

	public void methodC() {
	}

	public int methodD() {
		return 9;
	}

	// Valor de retorno invalido, se espera un int y regresa un double.
	// public int methodE() {
	// return 9.0;
	// }

	// Valor de retorno invalido, se espera un int y regresa void.
	// public int methodF() {
	// return;
	// }

	// Valor de retorno invalido, se espera un int y regresa null.
	// public int methodG() {
	// return null;
	// }

}
