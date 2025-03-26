package org.fercho.oca.review02.q07;
/* 7. What is the output of the following code?
            1: public class TernaryTester {
            2: public static void main(String[] args) {
            3: int x = 5;
            4: System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
            5: }}
A. 5
B. 4
C. 10
D. 8 -> Correcto, primero se evalua en false, toma el 8, segundo, se evalua en true, toma el 8.
E. 7
F. The code will not compile because of line 4.
A07. D.
*/

public class TernaryTester {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7); // false -> 8, true-> 8
    }

}
