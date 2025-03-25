package org.fercho.ocp.review02.q13;
/*
 * Q13. What is the output of the following code snippet?
 * A. true-false-false
 * B. false-true-false
 * C. true-true-true
 * D. false-true-true
 * E. false-false-false
 * F. true-true-false -> Unica correcta
 * G. None of the above.
 * 
 * A13. F. 
 */

public class Main {
    public static void main(String[] args) {
        boolean sunny = true, raining = false, sunday = true;
        boolean goingTotheStore = sunny & raining ^ sunday;
        boolean goingToTheZoo = sunday && !raining;
        boolean stayingHome = !(goingTotheStore && goingToTheZoo);
        System.out.println(goingTotheStore + " - " + goingToTheZoo + " - " + stayingHome);
    }
}
