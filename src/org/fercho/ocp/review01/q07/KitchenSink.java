package org.fercho.ocp.review01.q07;

/*
 * Q07. Which are true about this code?
 * 
 * A. The output includes # forks = 0.
 *  - Incorrecto. 
 * B. The output includes # knives = 0.
 *  - Incorrecto.
 * C. The output includes # cups = 0.
 *  - Correcto. Por que iguala el texto.
 * D. The output includes incluedes a blank line.
 *  - Incorrecto.  No se incluye linea en blanco.
 * E. The output includes # one or more line that begin with whitespace.
 *  - Correcto. Por que el texto asi lo marca. 
 * F. The code does not compile. 
 *  - Incorrecto. Compila.
 */
public class KitchenSink {

    private int numForks;

    public static void main(String[] args) {
        int numKnives;
        System.out.println("""
                "# Forks = " + numForks +
                 " # Knives = "+ numKnives +
                # cups = 0""");
        // System.out.println(numKnives);
    }

}
