package org.fercho.oca.review01.q21;
/*
 * Q21. What does the following code output?
 * A. 0
 * Correcto. El metodo Salmon, no es un constructor, tiene tipo de retorno void. count toma valor por defecto de int.
 * B. 4
 * Incorrecto.
 * C. Compilation fails on line 3. 
 * Incorrecto. nohay falla pero el metodo no es un constructor.
 * D. Compilation fails on line 4.
 * Incorrecto. 
 * E. Compilation fails on line 7. 
 * Incorrecto.
 * F. Compilation fails on line 8. 
 * Incorrecto.
 * 
 * A21. A.
 */

public class Salmon {
    int count;

    public void Salmon() { // line 3
        count = 4; // Line 4
    }

    public static void main(String[] args) {
        Salmon s = new Salmon(); // line 7
        System.out.println(s.count); // line 8
    }
}
