package org.fercho.ocp.review03.snippets;

/*
Q27. What is printed by the following code snippet?

byte amphibian = 1;
        String name = "Frog";
        String color = switch (amphibian) {
            case 1 -> { yield "Red";}
            case 2 -> { if (name.equals("Frog")) yield "Green";}
            case 3 -> { yield "Purple";}
            default -> throw new RuntimeException();
        };
        System.out.println(color);

A. Red

B. Green

C. Purple

D. RedPurple

E. An exception is thrown at runtime.

F. The code does not compile. -> Correcto.

A27. F. El caso 2 deberia de tener un yield para ambos casos de la condicion del if.
 */
public class Snippet27 {

    public static void main(String[] args) {

        byte amphibian = 1;
        String name = "Frog";
        String color = switch (amphibian) {
            case 1 -> {
                yield "Red";
            }
            case 2 -> {
                if (name.equals("Frog"))
                    yield "Green";
                else
                    yield "Black";
            }
            case 3 -> {
                yield "Purple";
            }
            default -> throw new RuntimeException();
        };
        System.out.println(color);
    }
}
