package org.fercho.ocp.review03.snippets;

import java.util.ArrayList;
import java.util.List;

/*
Q05. What is the output of the following code snipped?

    List<Integer> myFavoriteNumbers = new ArrayList<>();
            myFavoriteNumbers.add(10);
            myFavoriteNumbers.add(14);
            for (var a : myFavoriteNumbers) {
                System.out.println(a + ", ");
                break;
            }

            for (int b : myFavoriteNumbers) {
                continue;
                System.out.println(b + ", ");
            }

            for (Object c : myFavoriteNumbers) {
                System.out.println(c + ", ");
            }

A. It compiles and runs wihhout issue but does not produce any output.
B. 10, 14
C. 10, 10, 14
D.10, 10, 14, 10, 14
E. Exactly one line of code do not compile. -> Correcto
F.  Exactly two lines of code do not compile.
G. Three or more lines of code do nat compile.
H. The code contains an infinete loop and does not terminate.

A05. E. El continue del segundo foreach es inalcansable y no compila. Eliminando el continue, se corrije el error, la salida seria opcion D.
 */
public class Snippet05 {

    public static void main(String[] args) {
        List<Integer> myFavoriteNumbers = new ArrayList<>();
        myFavoriteNumbers.add(10);
        myFavoriteNumbers.add(14);
        for (var a : myFavoriteNumbers) {
            System.out.print(a + ", ");
            break;
        }

        for (int b : myFavoriteNumbers) {
            // continue;
            System.out.print(b + ", ");
        }

        for (Object c : myFavoriteNumbers) {
            System.out.print(c + ", ");
        }

    }

}
