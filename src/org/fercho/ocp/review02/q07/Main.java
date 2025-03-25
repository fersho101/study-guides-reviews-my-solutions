package org.fercho.ocp.review02.q07;

/*
 * Q07. What is the output of the following code snippet?
 * A. true-true-true
 * B. true-true-false
 * C. true-false-true
 * D. true-false-false
 * E. false-true-true
 * F. false-true-false
 * G. false-false-ttrue
 * H. false-false-false
 * 
 * A07. D.
 */
public class Main {
    public static void main(String[] args) {
        int ph = 7, vis = 2;
        boolean clear = vis > 1 & (vis < 9 || ph < 2);
        boolean safe = (vis > 2) && (ph++ > 1);
        boolean tasty = 7 <= --ph;
        System.out.println(clear+"-"+safe+"-"+ tasty);
    }

}
