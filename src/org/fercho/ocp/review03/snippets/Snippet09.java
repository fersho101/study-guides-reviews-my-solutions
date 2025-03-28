package org.fercho.ocp.review03.snippets;

/*
Q09. Which statement, when inserted independently into the following blank, will cause the code to print2 at runtime?

        int count = 0;
                BUNNY: for (int row = 1; row <= 3; row++)
                    RABBIT: for (int col = 0; col < 3; col++) {
                        if ((col + row) % 2 == 0)
                            break;
                        count++;
                    }
                System.out.println(count);

A. break BUNNY

B. break RABBIT

Correcto.

C. continue BUNNY

Correcto.

D. continue RABBIT

E. break

Correcto.

F. continue

G. None of the above, as the code contains a compiler error.

A09. B, C, E.
 */
public class Snippet09 {
    public static void main(String[] args) {
        int count = 0;
        BUNNY: for (int row = 1; row <= 3; row++)
            RABBIT: for (int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0)
                    break;
                count++;
            }
        System.out.println(count);

    }

}
