package org.fercho.ocp.review03.snippets;

/*
Q17. What distinct numbers are printed when the following method is executed?

        private static void countAttendees() {
            int participants = 4, animals = 2, performers = -1;
            while ((participants = participants + 1) < 10) {
            }
            do {
            } while (animals++ <= 1);
            for (; performers < 2; performers += 2) {
            }

            System.out.println(participants);
            System.out.println(animals);
            System.out.println(performers);
        }

A. 6

B. 3 -> Correcto, dos veces.

C. 4

D. 5

E. 10 -> Correcto

F. 9

G. The code does not compile.

H. None of the above.

A17. B, B, E.
*/
public class Snippet17 {

    private static void countAttendees() {
        int participants = 4, animals = 2, performers = -1;
        while ((participants = participants + 1) < 10) {
        }
        do {
        } while (animals++ <= 1);
        for (; performers < 2; performers += 2) {
        }

        System.out.println(participants);
        System.out.println(animals);
        System.out.println(performers);
    }
    public static void main(String[] args) {
        countAttendees();
    }

}
