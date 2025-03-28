package org.fercho.ocp.review03.snippets;
/*
Q11. What is the output of calling printLocation(Animal.MAMMAL)?

            public class Zoo {
                enum Animal {
                    BIRD, FISH, MAMMAL
                }

                void printLoaction(Animal a) {
                    long type = switch (a) { // Line 13
                        case BIRD -> 1;
                        case FISH -> 2;
                        case MAMMAL -> 3;
                        default -> 4; // Line 17
                    };
                System.out.println(type);
            }

A. 3 -> Correcto.

B. 4

C. 34

D. The code does not compile because of line 13.

E. The code does not compile because of line 17.

F. None of the above.

A11. A. Compila sin problema. Imprime 3. El default esta de mas, ya que todos los valores enum estan presentes.

 */

public class Zoo {
    enum Animal {
        BIRD, FISH, MAMMAL
    }

    void printLoaction(Animal a) {
        long type = switch (a) {
            case BIRD -> 1;
            case FISH -> 2;
            case MAMMAL -> 3;
            default -> 4;
        };
        System.out.println(type);
    }

    public static void main(String[] args) {
        Zoo z1 = new Zoo();
        z1.printLoaction(Animal.MAMMAL);
    }
}
