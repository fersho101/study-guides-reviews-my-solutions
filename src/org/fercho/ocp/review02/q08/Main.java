package org.fercho.ocp.review02.q08;

/*
 * Q08. What is the output of the following code snipped?
 * A. 4 - 1
 * Correcto. 
 * B. 4 - 2
 * C. 5 - 1
 * D. 5 - 2
 * E. The code does not compile dueto line 7.
 * F. Node of the above.
 *  
 * A08. A. Unico correcto.
 */

public class Main {
    public static void main(String[] args) {
        int pig = (short) 4;
        // Primero asigna el valor de 4 despues incrementa, pero el incremento aqui es descartado.
        pig = pig++;         
        long goat = (int) 2;
        //No tiene error, el valor es casteado por el operador -=
        goat -= 1.0; // Line 7
        System.out.println(pig + " - " + goat);
    }

}
