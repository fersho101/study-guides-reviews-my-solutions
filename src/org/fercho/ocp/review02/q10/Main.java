package org.fercho.ocp.review02.q10;

/*
 * Q10. What are the unique output of the following code snippet?
 * A. 1
 * B. 2
 * C. 3
 * D. 4
 * E. %
 * F. 6
 * G. The code does not compile.
 * Correcto. No compila, weight y height son promovido a int, y no caben en un short sin casr explicito.
 * 
 * A10. G. 
 */
public class Main {
    public static void main(String[] args) {
        short height = 1, weight = 3;
        // short zebra = (byte) weight * (byte) height; // Error, no compila.
        // short zebra = (short)((byte) weight * (byte) height); // posible solucion
        int zebra = (byte) weight * (byte) height;// posible solucion
        double ox = 1 + height * 2 + weight;
        long girafe = 1 + 9 % height + 1;
        System.out.println(zebra);
        System.out.println(ox);
        System.out.println(girafe);
    }
}
