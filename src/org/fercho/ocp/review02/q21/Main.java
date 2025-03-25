package org.fercho.ocp.review02.q21;
/*
 * What is the result of executing the following code snipped?
 * A. -7, -8, 9
 * B. -1,-8, 10
 * C. -8, -8, 4
 * D. -8, -8, 5
 * E. -9, -8, 9 -> Correcto
 * F. -9, -8, 10
 * G. None of the above.
 * 
 * A21. E.
 */

public class Main {
    public static void main(String[] args) {
        int myFavoriteNumber = 8;
        int bird = ~myFavoriteNumber; // -9
        int plane = -myFavoriteNumber; // 8
        var superman = bird == plane ? 5 : 10; // 10
        System.out.println(bird + ", " + plane + ", " + --superman); // -9, 8, -9
    }

}
