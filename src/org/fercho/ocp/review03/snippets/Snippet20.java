package org.fercho.ocp.review03.snippets;

/*
Q20. Which statements. when inseted into the following blanks, allow the code to compile and run without entering an infinite loop?

        int height = 1;
        L1: while (height++ < 10) {
            long humidity = 12;
            L2: do {
                if (humidity-- % 12 == 0) {
                                                    // Line 8
                }
                int temperature = 30;
                L3: for (;;) {
                    temperature++;
                    if (temperature > 50) {
                                                    // Line 12
                    }
                }
            } while (humidity > 4);
        }

A. break L2 on line 8; continue L2 on line 12.

B. continue on line 8; continue on line 12.

C. break L3 on line 8; break L1 on line 12.

D. continue L2 on line 8; continue L3 on line 12.

E. continue L2 on line 8; continue L2 on line 12.

F. None of the above, as the code contains a compiler error.

A20. A, E.

 */
public class Snippet20 {
    public static void main(String[] args) {
        int height = 1;
        L1: while (height++ < 10) {
            // System.out.println("height - " + height);
            long humidity = 12;
            L2: do {
                if (humidity-- % 12 == 0) {
                    continue L2;// Line 8
                }
                int temperature = 30;
                L3: for (;;) {
                    temperature++;
                    if (temperature > 50) {
                        continue L2 ;// Line 12
                    }
                }
            } while (humidity > 4);
        }
        // System.out.println("height: " + height);


    } // main
} // class
