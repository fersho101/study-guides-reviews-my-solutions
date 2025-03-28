package org.fercho.ocp.review03.snippets;

import java.util.ArrayList;
import java.util.List;

/*
Q15.Which is the result of the following code snippet?

        final char a = 'A', e = 'E';
        char grade = 'B';
        switch (grade) {
            default:
            case a:
                case 'B': 'C': System.out.println("great ");
            case 'D':
                System.out.println("good ");
                break;
            case e:
            case 'F':
                System.out.println("not good ");
        }

A. great

B. great good.

C. good

D. not good.

E. The code does not compile because the data type of one or more case statements does not match the data type of the switch variable.

F. None of the above. -> Correcto.

A15. F. El codigo no compila. Exite mal sintaxis en el case C, falta la palabra case. Solucionando ese error de sintaxis, el codigo imprime great good, opcion B.

 */
public class Snippet15 {
    public static void main(String[] args) {
        final char a = 'A', e = 'E';
        char grade = 'B';
        switch (grade) {
            default:
            case a:
                // case 'B': 'C': System.out.println("great "); 
                case 'B': case 'C': System.out.println("great ");  // Fixed to compile
            case 'D':
                System.out.println("good ");
                break;
            case e:
            case 'F':
                System.out.println("not good ");
        }
    }
}
