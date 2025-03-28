package org.fercho.ocp.review03.snippets;

/*
Q26. What is the output of the following code snippet?

    int w = 0, r = 1;
    String name = "";

    while(w < 2 ) {
        name +="A";
        do {
            name += "B";
            if(name.length() > 0) name += "C";
            else break; 
        } while(r <= 1);
        r++; w++; 
    }
    System.out.println(name);

A. ABC

B. ABCABC

C. ABCABCABC

D. Line 15 contains a compilation error.

E. Line 18 contains a compilation error.

F. The cade compiles but never terminates at runtime. -> Correcto.

G. The code compiles but throws a NullPointerException at runtime.

A26. F. Produce un ciclo infinito por la variable r. Se incrementa fuera del do/while y la condicion del while siempre es true.
 */
public class Snippet26 {
    public static void main(String[] args) {
        int w = 0, r = 1;
        String name = "";

        while (w < 2) {
            name += "A";
            do {
                name += "B";
                if (name.length() > 0)
                    name += "C";
                else
                    break;
            } while (r <= 1);
            r++;
            w++;
        }
        System.out.println(name);
    }

}
