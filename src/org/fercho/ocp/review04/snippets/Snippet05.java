package org.fercho.ocp.review04.snippets;

/*
Q05. What is the result of the following code?

A. abbaaccc

B. abbaccca

C. bbaaaccc

D. bbaaccca

E. An empty line.

F. The code does not compile.

A05. B
 */
public class Snippet05 {
    public static void main(String[] args) {
        var sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc"); // aaa -> abbaa -> abbaccca
        System.out.println(sb);
    }

}
