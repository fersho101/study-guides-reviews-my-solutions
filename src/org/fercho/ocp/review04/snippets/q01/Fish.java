package org.fercho.ocp.review04.snippets.q01;

/*
 * Q01. What is the following code?
 * 
 * A. 4 1
 * 
 * B. 5
 * 
 * C. 5 tuna
 * 
 * D. 5tuna
 * 
 * E. 51tuna
 * 
 * F. The code does not compile.
 * 
 * A01. F. el codigo no compila. Se esta tratando de asignar un int, que es primitivo a un tipo String.
 */

public class Fish {

    public static void main(String[] args) {
        int numFish = 4;
        String fishType = "tuna";
        // String anotherFish = numFish + 1;
        // System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);
    }

}
