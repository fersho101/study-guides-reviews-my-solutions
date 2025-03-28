package org.fercho.ocp.review03.snippets;

/*
Q23. What is the output of the following code snippet?

    int penguin = 50, turtle = 75;
    boolean older = penguin >= turtle;
    if(older = true) System.out.println("Success"); // Line 17
    else System.out.println("Failure");
    else if(penguin != 50) System.out.println("Other");

A. Success

B. Failure

C. Other

D. The code will not compile because of line 17.

E. The code compiles but throws an exception at runtime.

F. None of the above.

A23. F. El codigo no compila por el if-else fuera de lugar. Entrecambiando las lineas 18 y 19, correria sin problema.
 */
public class Snippet23 {
    public static void main(String[] args) {
        int penguin = 50, turtle = 75;
        boolean older = penguin >= turtle;
        if (older = true)
            System.out.println("Success");
        else if (penguin != 50) // Intercambiada
            System.out.println("Other");
        else // Intercambiada
            System.out.println("Failure");

    }
}
