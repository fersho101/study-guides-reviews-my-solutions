package org.fercho.ocp.review01.q17;

/*
 * Q17. Which lines are printed by the following program?
 * A. Line 8 generates a compiler error.
 * Incorrecto. 
 * B. Line 9 generates a compiler error.
 * Incorrecto.
 * C. Empty = 
 * Incorrecto.
 * D. Empty = false
 * Correcto. Valor por default de class variable tipo boolean.
 * E. Brand = 
 * Incorrecto.
 * F. Brand = null
 * Correcto. Valor por default de class variable tipo String.
 * G. Code = 0.0
 * Correcto. Valor por default de float variable class.
 * H. Code = 0f
 * Incorrecto.
 * 
 * A17. D, F, G.
 * 
 */
public class WaterBottle {

    private String brand;
    private boolean empty;
    public static float code;

    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();
        System.out.println("Empty = " + wb.empty);
        System.out.println("Brand = " + wb.brand); // Linea 8
        System.out.println("Code = " + code); // Linea 9
    }

}
