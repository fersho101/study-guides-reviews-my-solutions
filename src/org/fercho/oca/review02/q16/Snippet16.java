package org.fercho.oca.review02.q16;
/*
Q 16. What is the output of the following code snippet?

            3: do {
            4: int y = 1;
            5: System.out.print(y++ + " ");
            6: } while(y <= 10);

A. 1 2 3 4 5 6 7 8 9
B. 1 2 3 4 5 6 7 8 9 10
C. 1 2 3 4 5 6 7 8 9 10 11
D. The code will not compile because of line 6. -> Correcto.
E. The code contains an infinite loop and does not terminate.

A16. D. y Es una variable local del loop de while. Si estuviera declarada afuera. Seria un loop infinito, por que en cada iteracion se inicializa en 1.
*/

public class Snippet16 {
    public static void main(String[] args) {
         int y; // declarada fuera para compilar
        do {
            y = 1; // Ocaciona loop infinito.
            System.out.println(y++ + " ");
        } while (y <= 10);
    }

}
