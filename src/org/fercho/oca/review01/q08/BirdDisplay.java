package org.fercho.oca.review01.q08;

/*
 * 8. Given the following class, which of the following calls print out Blue Jay? (Choose all that apply).
 * A. java BirdDisplay Sparrow Blue Jay
 * B. java BirdDisplay Sparrow "Blue Jay"
 * Correcto. Unico correcto. Cadena que contiene espacios en blanco. Va entre comillas.
* C. java BirdDisplay Blue Jay Sparrow
*D. java BirdDisplay "Blue Jay" Sparrow
*E. java BirdDisplay.class Sparrow "Blue Jay"
*F. java BirdDisplay.class "Blue Jay" Sparrow
 * AQ08. B.
 */

public class BirdDisplay {
    public static void main(String[] name) {
        System.out.println(name[1]);
    }
}
