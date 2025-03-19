package org.fercho.oca.review01.q02;

/*
* Q02. What is the output of the following program? 
* A. Line 6 generates a compiler error.
* Incorrecto.
* B. Line 7 generates a compiler error.
* Incorrecto.
* C. There is no output. 
* Incorrecto.
* D. Empty = false, Brand = null
* Correcto. Las variables de clase toman valores por default.
* E. Empty = false, Brand =
* Incorrecto.
* F. Empty = null, Brand = null
*  Incorrecto.
* A02. D.
 */

public class WaterBottle {
    private String brand;
    private boolean empty;

    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();
        System.out.print("Empty = " + wb.empty); // Line 6
        System.out.print(", Brand = " + wb.brand); //Line 7
    }
}
