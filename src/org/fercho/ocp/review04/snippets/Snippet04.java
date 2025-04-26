package org.fercho.ocp.review04.snippets;

/*
 * Q05. Which of the following are output by this code?
 * 
 * A. one
 * 
 * B. two
 * 
 * C. three
 * 
 * D. four
 * 
 * E. five
 * 
 * F. The code does not compile.
 * 
 * G. None of the above.
 * 
 * A04. A, C, D.
 */
public class Snippet04 {
    public static void main(String[] args) {

        var s = "Hello";
        var t = new String(s);
        if ("Hello".equals(s)) // true
            System.out.println("one"); 
        if (t == s) //false Son diferentes strings
            System.out.println("two");
        if (t.intern() == s) //true
            System.out.println("three");
        if ("Hello" == s)//true
            System.out.println("four");
        if ("Hello".intern() == t) // false Son diferentes strings
            System.out.println("five");

    }
}
