package org.fercho.ocp.review03.snippets;

/*
Q13. What is the output of the following snippet?

boolean keepGoing = true;
        int result = 15, meters = 10;
        do {
            meters--;
            if (meters == 8) keepGoing = false; // Line 6
            result -= 2;
        } while keepGoing;
        System.out.println(result);

A. 7

B. 9

C. 10

D. 11

E. 15

F. The code will not compile because of line 6.

G. The code does not compile for a different reason.

A13. G. El while no presenta los parentesis en la condicion. Solucionando eso el resultado es 11, seria opcion D.
 */
public class Snippet13 {

    public static void main(String[] args) {
        boolean keepGoing = true;
        int result = 15, meters = 10;
        do {
            meters--;
            if (meters == 8)
                keepGoing = false;
            result -= 2;
        // } while keepGoing; // Faltan parentesis en la codicion.
        } while (keepGoing); // Solucionado para compilar.
        System.out.println(result);
    }

}
