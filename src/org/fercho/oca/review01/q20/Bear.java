package org.fercho.oca.review01.q20;

/*
 * Q20. What is true about the following code? (Choose all that apply)
 * A. finalize() is guaranteed to be called.
 * Incorrecto. No es garantia.
 * B. finalize() might or might not be called.
 * Correcto. Lo mas seguro es que quien sabe.
 * C. finalize() is guaranteed not to be called.
 * Incorrecto. Sigue sin ser garantizado.
 * D. Garbage collection is guaranteed to run.
 * Incorrecto. No es garantia.
 * E. Garbage collection might or might not run.
 * Correcto. JVM es la que decide, donde y cuando.
 * F. Garbage collection is guaranteed not to run.
 * Incorrecto. No es garantia.
 * G. The code does not compile.
 * Incorercto. Corre sin problema.
 * 
 * A20.  B, E.
 */

public class Bear {
    protected void finalize() {
        System.out.println("Roar!");
    }

    public static void main(String[] args) {
        Bear bear = new Bear();
        bear = null;
        System.gc();
    }
}
