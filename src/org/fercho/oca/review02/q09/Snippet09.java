package org.fercho.oca.review02.q09;

/* Q09. How many times will the following code print "Hello World"?
            3: for(int i=0; i<10 ; ) {
            4: i = i++;
            5: System.out.println("Hello World");
            6: }
A. 9
B. 10
C. 11
D. The code will not compile because of line 3.
E. The code will not compile because of line 5.
F. The code contains an infinite loop and does not terminate.  -> Correcto, i vale 0 en cada iteracion del loop.

A09. F.
*/
public class Snippet09 {
    public static void main(String[] args) {
        for (int i = 0; i < 10;) {
            i = i++;
            System.out.println(i + "Hello World");
        }
    }
}
