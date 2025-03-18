package org.fercho.ocp.review01.q23;
/*
 * Q23. Which statement about the following class are true?
 * A. Line 3 generates a compiler error.
 * Correcto. Falta la f al literal.
 * B. Line 6 generates a compiler error.
 * C. Line 7 generates a compiler error.
 * D. Line 10 generates a compiler error.
 * Correcto. depth esta fuera de su scope.
 * E. The program prints 3 on line 10.
 * E. The program prints 4 on line 10.
 * E. The program prints 50.0 on line 10.
 * E. The program prints 49.0 on line 10.
 */

public class River {
    int Depth;
    float temp = 50.0f; // Linea 3

    public void flow() {
        for (int i = 0; i < 1; i++) {
            int depth = 2; // Linea 6
            depth++; // Linea 7
            temp--;
        }
        // System.out.println(depth); // Linea 10
        System.out.println(temp);
    }

    public static void main(String[] args) {
        new River().flow();
    }

}
