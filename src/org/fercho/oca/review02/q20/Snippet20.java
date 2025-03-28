package org.fercho.oca.review02.q20;

/*
Q20. What is the result of the following code snippet?

            3: final char a = 'A', d = 'D';
            4: char grade = 'B';
            5: switch(grade) {
            6: case a:
            7: case 'B': System.out.print("great");
            8: case 'C': System.out.print("good"); break;
            9: case d:
            10: case 'F': System.out.print("not good");
            11: }

A. great
B. greatgood -> Correcto.
C. The code will not compile because of line 3.
D. The code will not compile because of line 6.
E. The code will not compile because of lines 6 and 9. 

A20. B. En el caso de B se imprime great, pero no hay break, se sigue ejecuanto al siguiente caso y se imprime good, hasta q alcanza el break y sale del flujo del switch.

*/
public class Snippet20 {
    public static void main(String[] args) {
        final char a = 'A', d = 'D';
        char grade = 'B';
        switch (grade) {
            case a:
            case 'B':
                System.out.print("great");
            case 'C':
                System.out.print("good");
                break;
            case d:
            case 'F':
                System.out.print("not good");
        }
    }

}
