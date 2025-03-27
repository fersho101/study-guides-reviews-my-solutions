package org.fercho.ocp.review03.snippets;

/*
Q08. What is the output of calling printType?

            void printType(Object o) {
        if (o instanceof Integer bat) {
            System.out.println("int");
        } else if (o instanceof Integer bat && bat < 10) {
            System.out.println("small int");
        } else if(o instanceof Long bat || bat <= 20 ) {
            System.out.println("long");
        } default {
            System.out.println("unknown");
        }

A. int

B. small int

C. long

D. unknown

E. Nothing is printed.

F. The code contains one line that does not compile.

G. The code contains two lines that do not compile.

Correcto. 

H. None of the above.

A08.G.

 */

public class Snippet08 {

    static void printType(Object o) {
        if (o instanceof Integer bat) {
            System.out.println("int");
        } else if (o instanceof Integer bat && bat < 10) {
            System.out.println("small int");
        }
        // else if(o instanceof Long bat || bat <= 20 ) {
        // System.out.println("long");
        // }
        // default {
        // System.out.println("unknown");
        // }
    }

    public static void main(String[] args) {
        printType(11);
    }
}
