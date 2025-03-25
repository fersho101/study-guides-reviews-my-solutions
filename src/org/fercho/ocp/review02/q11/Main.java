package org.fercho.ocp.review02.q11;

/*
 * Q11. What is the output of the following code?
 * A. 0, 0, 5
 * Incorrecto.
 * B. 1, 2, 10
 * Incorrecto.
 * C. 2,  1, 5
 * Incorrecto.
 * D. 2, 0, 5
 * Correcto.
 * E. 3, 1, 10
 * Incorrecto.
 * F. 3, 2, 6
 * Incorrecto.
 * G. The code does not compile. 
 * Incorrecto. *
 *  
 * A11. D.
 */
public class Main {
    public static void main(String[] args) {
        int sample1 = (2 * 4) % 3; // 2
        int sample2 = 3 * 2 % 3; // 0
        int sample3 = 5 * (1 % 2); // 5
        System.out.println(sample1 + ", " + sample2 + ", " + sample3);
    }

}
