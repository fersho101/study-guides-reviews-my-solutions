package org.fercho.oca.review03.snippet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
23. What is the result of the following?
4: List<Integer> list = Arrays.asList(10, 4, -1, 5);
5: Collections.sort(list);
6: Integer array[] = list.toArray(new Integer[4]);
7: System.out.println(array[0]);
A. –1
B. 10
C. Compiler error on line 4.
D. Compiler error on line 5.
E. Compiler error on line 6.
F. An exception is thrown.
 */
public class Snippet23 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 4, -1, 5);
		Collections.sort(list);
		Integer array[] = list.toArray(new Integer[4]);
		System.out.println(array[0]); // -1
	}
}
