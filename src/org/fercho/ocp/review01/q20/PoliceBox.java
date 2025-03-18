package org.fercho.ocp.review01.q20;

/*
 * Q20. Which statement about the following class are correct?
 * A. It prints Q1=blue
 * Incorrecto.
 * B. It prints Q2= 1200
 * Incorrecto.
 * C. It prints P1=null
 * Correcto.
 * D.It prints P2=1400
 * Incorrecto.
 * E. Line 4 does not compile.
 * Incorrecto. Compila.
 * F. Line 12 does not compile.
 * Incorrecto. Compila.
 * G. Line 13 does not compile.
 * Incorrecto. Compila.
 * H.None of the above.
 * Incorrecto.
 * 
 * A20. C.
 * 
 */
public class PoliceBox {
    String color;
    long age;

    public void PoliceBox() { // Linea 4
        color = "blue";
        age = 1200;
    }

    public static void main(String[] args) {
        var p = new PoliceBox();
        var q = new PoliceBox();

        p.color = "green";
        p.age = 1400; // Linea 12
        p = q; // Linea 13
        System.out.println("Q1=" + q.color);
        System.out.println("Q2=" + q.age);
        System.out.println("P1=" + p.color);
        System.out.println("P2=" + p.age);
    }
}
