package org.fercho.ocp.review02.q09;

/*
 * Q09. What are the unique outputs of the following code snippet?
 * A. 1 
 * Correcto.
 * B. 2
 * C. 3
 * D. 4
 * Correcto.
 * E. 5
 * Correcto.
 * F. 6
 * G. The code does not compile.
 * 
 * A09. A, D, E.
 */
public class Main {
    public static void main(String[] args) {
        int a = 2, b = 4, c = 2;
        System.out.println(a > 2 ? --c : b++); // se mprime 4, despues se incre,enta a 5
        System.out.println(b = (a != c ? a : b++)); // 5 -> 6, pero el 6 se descarta por postoperator.
        System.out.println(a > b ? b > c ? b : 2 : 1); // 1
    }
}
