package org.fercho.oca.review02.q05;

/*
*Q05. What is the output of the following code snippet?
        3: java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        4: list.add(10);
        5: list.add(14);
        6: for(int x : list) {
        7: System.out.print(x + ", ");
        8: break;
        9: }

*A. 10, 14,
*B. 10, 14
*C. 10, --> Correcto. El break cambia el flujo del loop despues de la impresion del primer elemento. 
*D. The code will not compile because of line 7.
*E. The code will not compile because of line 8.
*F. The code contains an infinite loop and does not terminate.

* A05. C.
 **/

public class Snippet05 {
    public static void main(String[] args) {
        java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        list.add(10);
        list.add(14);
        for (int x : list) {
            System.out.print(x + ", ");
            break;
        }
    }
}
