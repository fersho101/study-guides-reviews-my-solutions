package org.fercho.oca.review02.q11;
/*
Q11. What is the output of the following code?
            1: public class ArithmeticSample {
            2: public static void main(String[] args) {
            3: int x = 5 * 4 % 3;
            4: System.out.println(x);
            5: }}
A. 2 -> Correcto el residuo de 20 entre 3 es 2.
B. 3
C. 5
D. 6
E. The code will not compile because of line 3. 

A11. A.
*/



public class ArithmeticSample {
    public static void main(String[] args) {
        int x = 5 * 4 % 3; // 2
        System.out.println(x);
    }

}
