package org.fercho.oca.review01.q19;

/*
* 19. Suppose we have a class named Rabbit. Which of the following statements are true? (Choose all that apply)
* A. The Rabbit object from line 3 is first eligible for garbage collection immediately following line 6.
* Incorrecto. Tiene sigue apuntando a three.
* B. The Rabbit object from line 3 is first eligible for garbage collection immediately following line 8.
* Correcto
* C. The Rabbit object from line 3 is first eligible for garbage collection immediately following line 12.
* Incorrecto. Ya antes era elegible para garbage collection.
* D. The Rabbit object from line 4 is first eligible for garbage collection immediately following line 9.
* Correcto.
* E. The Rabbit object from line 4 is first eligible for garbage collection immediately following line 11.
* Incorrecto. Ya antes era elegible para garbage collection.
* F. The Rabbit object from line 4 is first eligible for garbage collection immediately following line 12.
* Incorrecto. Ya antes era elegible para garbage collection.
*
* A19. B, D.
 */

public class Rabbit {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Rabbit one = new Rabbit(); // line 3
        Rabbit two = new Rabbit(); // line 4
        Rabbit three = one;
        one = null; // line 6
        Rabbit four = one;
        three = null; // line 8
        two = null; // line 9
        two = new Rabbit();
        System.gc();// line 11
    } // line 12
}
