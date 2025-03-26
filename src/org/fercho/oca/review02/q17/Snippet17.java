package org.fercho.oca.review02.q17;

/*
Q17. What is the output of the following code snippet?

            3: boolean keepGoing = true;
            4: int result = 15, i = 10;
            5: do {
            6: i--;
            7: if(i==8) keepGoing = false;
            8: result -= 2;
            9: } while(keepGoing);
            10: System.out.println(result);

A. 7
B. 9
C. 10
D. 11 -> Correcto.
E. 15
F. The code will not compile because of line 8.

A17. D. El loop se ejecuta exactamente 2 veces. reult se decrementa en par de acaciones. como resultado es 11.

 */
public class Snippet17 {
    public static void main(String[] args) {
        boolean keepGoing = true;
        int result = 15, i = 10;

        do {
            i--;
            if (i == 8)
                keepGoing = false;
            result -= 2;
        } while (keepGoing);
        System.out.println(result);
    }

}
