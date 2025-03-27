package org.fercho.ocp.review03.snippets;

/*
Q02. What is the output of the following code snippet?
            int temperature = 4;
        long humedity = -temperature + temperature * 3; // 8
        if (temperature >= 4) 
        if (humedity < 6) System.out.println("Too Low");
        else System.out.println("Just Rigth");
        else System.out.println("Too High");
    
A. Too Low
B. Just Right
C. Too Low
D. A NullPointerException is thrown at runtime.
E. The code will not compile because of line 7.
F. The code will not compile because of line 8.

A02.  B. 

*/

public class Snippet02 {
    public static void main(String[] args) {
        int temperature = 4;
        long humedity = -temperature + temperature * 3; // 8
        if (temperature >= 4) {
            if (humedity < 6)
                System.out.println("Too Low");
            else
                System.out.println("Just Rigth");
        } else
            System.out.println("Too High");
    }

}
