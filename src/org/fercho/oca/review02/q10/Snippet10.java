package org.fercho.oca.review02.q10;
/*
Q10. What is the output of the following code?
            3: byte a = 40, b = 50;
            4: byte sum = (byte) a + b;
            5: System.out.println(sum);
A. 40
B. 50
C. 90
D. The code will not compile because of line 4. -> Correcto. Por que el cast solo se aplica a la variable a. Corrigiendo la salida es 90.
E. An undefined value.

A10. D
 */

public class Snippet10 {
    public static void main(String[] args) {
        byte a = 40, b = 50;
        // byte sum = (byte) a + b;
        byte sum = (byte) (a + b); // Corregido para compilar. 
        System.out.println(sum);
    }

}
