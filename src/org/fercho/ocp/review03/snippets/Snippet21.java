package org.fercho.ocp.review03.snippets;

/*
Q21. A minumum of how many lines need to be corrected before the following method will compile?
void findZookeeper(Long id) {
        System.out.println(switch(id) {
            case 10 -> {"Jane"}
            case 20 -> {yield "Lisa";};
            case 30 -> "Kelly";
            case 30 -> "Sahara";
            default -> "Unassined";
        });
}
A. Zero

B. One

C. Two

D. Three

E. Four -> Correcto

F. Five

A21. E. 
 * El tipo de dato long no es permitido en switch, ni expression ni en statement.
 * En case 10 le hace falta el yield y el punto y coma o semicolon.
 * En case 20 le sobra un semicolon.
 * El case 30, esta repetido.

 */
public class Snippet21 {
    public static void main(String[] args) {
        findZookeeper(10);
    }

    static void findZookeeper(int id) {
        System.out.println(
            switch(id) {
                case 10 -> {yield "Jane";}
                case 20 -> {yield "Lisa";}
                case 30 -> "Kelly";
                case 31 -> "Sahara";
                default -> "Unassined";
            }
        );
    }
}
