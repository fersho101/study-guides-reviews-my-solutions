package org.fercho.ocp.review03.snippets;

/*
Q04. What is the output of calling printReptile?

A.Snake
B. Lizaard
C. Turtle
D. Alligator
E. TurtleAlligator
F. None of the above -> No compila pq necesita cubrir todas la posibilidades, agragando un default se logra el objetivo. en este caso la respuesta sera C, "Turtle". 

A04. F
 */

public class Snippet04 {
    public static void main(String[] args) {
        Snippet04 a1 = new Snippet04();
        a1.printReptile(6);
        
    }

    void printReptile(int category) {
        var type = switch (category) {
            case 1, 2 -> "Snake";
            case 3, 4 -> "Lizard";
            case 5, 6 -> "Turtle";
            case 7, 8 -> "Alligator";
            default -> "None of the above"; // Agregado para compilar
        };
        System.out.println(type);        
    }

}
