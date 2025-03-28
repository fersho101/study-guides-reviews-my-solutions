package org.fercho.ocp.review03.snippets;

/*Q19. What is the output of the following code snippet?

        double iguana = 0;
        do {
            int snake = 1;
            System.out.print(snake++ + " ");
            iguana--;
        } while (snake <= 5);
        System.out.print(iguana);

A. 1 2 3 4 -4.0

B. 1 2 3 4 -5.0

C. 1 2 3 4 5 -4.0

D. 0 1 2 3 4 5 -5.0

E. The code does not compile.

F. The code compiles but produce an infinite loop at runtime.

G. None of the above.

A19. E. snake est fuera de su scope, es declarada dentro del do/while.

 */
public class Snippet19 {
    public static void main(String[] args) {
        double iguana = 0;
        int snake = 1;
        do {
            // int snake = 1;
            System.out.print(snake++ + " ");
            iguana--;
        } while (snake <= 5);
        System.out.print(iguana);
    }
}
