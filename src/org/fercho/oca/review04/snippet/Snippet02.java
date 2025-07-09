package org.fercho.oca.review04.snippet;

/*
 * 2. Which of the following compile? (Choose all that apply)
A. final static void method4() { }
B. public final int void method() { }
C. private void int method() { }
D. static final void method3() { }
E. void final method() {}
F. void public method() { }

A02. A, D
 */
public class Snippet02 {
	final static void method4() {
	}

	// public final int void method() { } // Contiene 2 tipos de retorno

	// private void int method() { } // Contiene 2 tipos de retorno

	static final void method3() {
	}

	// void final method() {} // Invalida ubicacion del tipo de retorno

	// void public method() { } // Invalida ubicacion del tipo de retorno
}
