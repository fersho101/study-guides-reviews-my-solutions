package org.fercho.ocp.review03.snippets;

/*
Q16. Given the following arrays, which code snippet print the elements in reverse order from how they are declared?

A.  
        int q = wolf.length;
        for (;;) {
            System.out.print(wolf[--q]);
            if (q == 0)
                break;
        }

B.
        for (int m = wolf.length - 1; m >= 0; --m)
            System.out.print(wolf[m]);
            
C.
        for (int z = 0; z < wolf.length; z++)
            System.out.print(wolf[wolf.length - z]);

D.
        int x = wolf.length - 1;
        for (int j = 0; x >= 0 && j == 0; x--) {
            System.out.print(wolf[x]);
        }

E.
        final int r = wolf.length;
        for (int w = r - 1; r > -1; w = r - 1)
            System.out.print(wolf[w]);

F.
        for (int i = wolf.length; i > 0; --i)
            System.out.print(wolf[i]);

G. None of the above.

A16. A,B,D.

*/

public class Snippets16 {

    static void A(char[] wolf) {
        int q = wolf.length;
        for (;;) {
            System.out.print(wolf[--q]);
            if (q == 0)
                break;
        }
    }

    static void B(char[] wolf) {
        for (int m = wolf.length - 1; m >= 0; --m)
            System.out.print(wolf[m]);
    }

    static void C(char[] wolf) {
        for (int z = 0; z < wolf.length; z++)
            System.out.print(wolf[wolf.length - z]);
    }

    static void D(char[] wolf) {
        int x = wolf.length - 1;
        for (int j = 0; x >= 0 && j == 0; x--) {
            System.out.print(wolf[x]);
        }
    }

    static void E(char[] wolf) {
        final int r = wolf.length;
        for (int w = r - 1; r > -1; w = r - 1)
            System.out.print(wolf[w]);
    }

    static void F(char[] wolf) {
        for (int i = wolf.length; i > 0; --i)
            System.out.print(wolf[i]);
    }

    public static void main(String[] args) {
        char[] wolf01 = { 'W', 'e', 'b', 'b', 'y' };
        System.out.println("A:");
        A(wolf01);
        System.out.println();

        System.out.println("B:");
        B(wolf01);
        System.out.println();

        // System.out.println("C:");
        // C(wolf01);
        // System.out.println();

        System.out.println("D:");
        D(wolf01);
        System.out.println();

        // System.out.println("E:");
        // E(wolf01);
        // System.out.println();

        // System.out.println("F:");
        // F(wolf01);
    }

}
