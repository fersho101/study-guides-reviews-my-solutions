package org.fercho.ocp.review03.snippets;

/*
Q22. What is the output of the following code snippet?

        var tailFeathers = 3;
        final var one = 1;

        switch (tailFeathers) {
            case one:
                System.out.println(3 + " ");
            default:
            case 3:
                System.out.println(5 + " ");
        }
        while (tailFeathers > 1) {
            System.out.println(--tailFeathers + " ");
        }

A. 3

B. 5 1

C. 5 2

D. 3 5 1

E. 5 2 1 -> Correcto.

F. The code will not compile because of line 3-5.

G. The code will not compile because of line 6.

A22. E. En el switch entra al default,  ahi, encuentra con el case 3, que es nuestro valor, imprime 5. El while se ejecuta 2 veces en total, imprime 2 y por ultimo 1. Teniendo a la salida 5 2 1.
 */
public class Snippet22 {

    public static void main(String[] args) {

        var tailFeathers = 3;
        final var one = 1;

        switch (tailFeathers) {
            case one:
                System.out.println(3 + " ");
            default:
            case 3:
                System.out.println(5 + " ");
        }
        while (tailFeathers > 1) {
            System.out.println(--tailFeathers + " ");
        }
    }

}
