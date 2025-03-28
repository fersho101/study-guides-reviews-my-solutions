package org.fercho.ocp.review03.snippets;

/*
Q24. Which of the following are possible data types for friends that would allow the code to compile?.

        for(var friend in friends) {
            System.out.println(friend);
        }

A. Set

B. Map

C. String

D. int[]

E. Collection

F. StringBuilder

G. None of the above.

A. G. in no existe en Java. Si vcambiamos in por :, entonces Set, int[] y Collection compilaria.
 */
public class Snippet24 {

    public static void main(String[] args) {
       int[] friends = new int[3]; // Example
        for(var friend : friends) {
            System.out.println(friend);
        }
    }

}
