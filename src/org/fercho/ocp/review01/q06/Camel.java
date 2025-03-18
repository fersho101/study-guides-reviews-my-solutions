package org.fercho.ocp.review01.q06;

/*
 * Assuming the following class copiles, how many variables defined in the class or method are in scope on the line marked on line 14?
 * 
 * A. 2
 * B. 3
 * C. 4
 * D. 5
 * E. 6
 * F. 7
 * G. None of the above.
 * 
 * A06. F
 */
public class Camel {
    {
        int hairs = 3_000_0; // no
    }
    long water, air = 2; // 1,2

    boolean twoHumps = true; // 3

    public void spit(float distance) { //7
        var path = ""; // 4
        {
            double teeth = 32 + distance++; //no
        }
        while (water > 0) {
            int age = twoHumps ? 1 : 2; // 5
            short i = -1; // 6
            for (i = 0; i < 10; i++) {
                var Private = 2; // no
            }
            // SCOPE
        }
    }
}
