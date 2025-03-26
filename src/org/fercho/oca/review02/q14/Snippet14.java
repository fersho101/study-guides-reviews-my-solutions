package org.fercho.oca.review02.q14;
/*
14. What is the output of the following code snippet?
            3: int c = 7;
            4: int result = 4;
            5: result += ++c;
            6: System.out.println(result);

A. 8
B. 11
C. 12 -> Correcto. 
D. 15
E. 16
F. The code will not compile because of line 5.

A14. C.
 */

public class Snippet14 {
    public static void main(String[] args) {
        int c = 7;
        int result = 4;
        result += ++c; // 4 + (1+7) -> 12
        System.out.println(result);
    }

}
