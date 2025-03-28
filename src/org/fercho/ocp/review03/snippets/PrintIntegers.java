package org.fercho.ocp.review03.snippets;

/*
Q29. What is the result of the following code?

public class PrintIntegers {
    public static void main(String[] args) {
        int y = -2;
        do System.out.print(++y + " ");
        while(y<=5);
    }
}

A. -2 -1 0 1 2 3 4 5

B. -2 -1 0 1 2 3 4 

C. -1 0 1 2 3 4 5 6 -> Correcto.

D. -1 0 1 2 3 4 5

E. An exception is printed.

F. None of the above.

A29. C. 
 */
public class PrintIntegers {
    public static void main(String[] args) {
        int y = -2;
        do
            System.out.print(++y + " ");
        while (y <= 5);
    }
}
