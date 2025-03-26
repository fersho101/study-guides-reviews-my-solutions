package org.fercho.oca.review02.q03;

/*
 * Q03.  What is the output of the following application?
 * 
 * A. Greater than,10
*  B. false,10
*  C . Greater than,11
*  D. false,11
*  E. The code will not compile because of line 4.
*  F. The code will not compile because of line 5. -> Correcto. Pq el resultado esta asignado a un String. 
 */

public class CompareValues {
    public static void main(String[] args) {
        int x =0;
        while (x++ < 10) {  }  // Line 4
        // String message = x > 10 ? "Greater than" : false; // Line 5
        String message = x > 10 ? "Greater than" : "false"; // Line 5. Corregido para compilar
        System.out.println(message + ", " + x);
    }
}
