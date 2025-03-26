package org.fercho.oca.review02.q15;

/*
Q15. What is the output of the following code snippet?

            3: int x = 1, y = 15;
            4: while x < 10
            5: y––;
            6: x++;
            7: System.out.println(x+", "+y);

A. 10, 5
B. 10, 6
C. 11, 5
D. The code will not compile because of line 3.
E. The code will not compile because of line 4. -> Correcto.
F. The code contains an infinite loop and does not terminate.

A15. E. La condicion del while no tien parentesis, y faltan las llaves para el cuerpo del while, con es de mas de un statement obliga a llevar llaves { }, corrigiendo eso, el resultado seria 10, 6, opcion B.
*/
public class Snippet15 {
    public static void main(String[] args) {
        int x = 1, y = 15;

        // while x < 10
        while (x < 10) { // Corregido para compilar
            y--;
            x++;
        }

        System.out.println(x + ", " + y);

    }

}
