package org.fercho.ocp.review01.q05;

/*
 * Q05. Which statements about the following are correct? * 
 * A. The object created on line 9 is eligible for garbage collector after line 13.
 *   Correcto.
 * B. The object created on line 9 is eligible for garbage collector after line 14.
 *  Incorrecto. 
 * C. The object created on line 10 is eligible for garbage collector after line 12.
 *  Incorrect. todavia es alcanzable por la referencia en la line 11.
 * D. The object created on line 10 is eligible for garbage collector after line 13.
 * Correcto. 
 * E. Garbage collector is guaranteed to run.
 *  Incorrecto.
 * F. Garbage collector might or might not run.
 *  Correcto. No existe garantia de que corra.
 * G. The code does not compile.
 *  Incorrecto. El codigo compila sin problema. 
 * 
 * A05. A, D, F.
 */

public class Bear {

    private Bear pandaBear;

    private void roar(Bear b) {
        System.out.println("Roar!");
        pandaBear = b;
    }

    public static void main(String[] args) {
        Bear brownBear = new Bear(); // line 9
        Bear polarBear = new Bear(); // line 10

        brownBear.roar(polarBear);
        polarBear = null; // line 12
        brownBear = null; // line 13
        System.gc(); // line 14
    }
}
