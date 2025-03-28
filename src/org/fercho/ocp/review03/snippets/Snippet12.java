package org.fercho.ocp.review03.snippets;
/*
Q12. What is the result of the following code snippet?

        int sing = 8, squawk = 2, notes = 0;
        while (sing > squawk) {
            sing--;
            squawk += 2;
            notes += sing + squawk; // Line 7
        }
        System.out.println(notes);

A. 11

B. 13

C. 23 -> Correcto

D. 33

E. 50

F. Teh code will not compile because of line 7.

A12. C. Corre sin problemas. 2 iteraciones, resultado 23.
 */

public class Snippet12 {

    public static void main(String[] args) {

        int sing = 8, squawk = 2, notes = 0;
        while (sing > squawk) {
            sing--;
            squawk += 2;
            notes += sing + squawk;
        }
        System.out.println(notes);
    }
}
