package org.fercho.oca.review02.q06;

/* 
* Q06. What is the output of the following code snippet?
        3: int x = 4;
        4: long y = x * 4 - x++;
        5: if(y<10) System.out.println("Too Low");
        6: else System.out.println("Just Right");
        7: else System.out.println("Too High");
* A. Too Low
*B. Just Right
* C. Too High
* D. Compiles but throws a NullPointerException.
* E. The code will not compile because of line 6.
* F. The code will not compile because of line 7. -> Correcto. No compila, seeria el segundo else.  Si este error presente, la salida seria "Just Right".
* A06. 
*/
public class Snippet06 {
    public static void main(String[] args) {
        int x = 4;
        long y = x * 4 - x++; // 16 - 4 -> 12
        System.out.println(y);
        if(y < 10) System.out.println("Too Low");
        else System.out.println("Just Right"); 
        // else System.out.println("Too high");  // No compila, dos else 
    }

}
