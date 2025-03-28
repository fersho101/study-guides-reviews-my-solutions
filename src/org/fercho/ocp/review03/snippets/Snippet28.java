package org.fercho.ocp.review03.snippets;

/*
What is the output of calling getFish("goldie")?

    void getFish(Object fish) {
        if(!(fish instanceof String guppy))
            System.out.println("Eat!");
        else if(!(fish instanceof String guppy))
            throw new RuntimeException();
        System.out.println("Swim!");
    }

A. Eat!

B. Swim!

C. Eat! followed by an exception.

D. Eat! Swim!

E. An exception is printed.

F. None of the above. -> Correcto.

A28. F. la pattern variable es duplicada. Corrigiendo el error imprime Swim!, opcion B.
 */
public class Snippet28 {

    static void getFish(Object fish) {
        if(!(fish instanceof String guppy))
            System.out.println("Eat!");
        else if(!(fish instanceof String guppy2))
            throw new RuntimeException();
        System.out.println("Swim!");
    }

    public static void main(String[] args) {
        getFish("goldie");
    }


}
