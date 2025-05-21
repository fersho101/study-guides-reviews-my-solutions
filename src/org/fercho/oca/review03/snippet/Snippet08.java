package org.fercho.oca.review03.snippet;

public class Snippet08 {
	public static void main(String[] args) {
		String numbers = "012345678";
		System.out.println(numbers.substring(1, 3)); // 12
		System.out.println(numbers.substring(7, 7)); // nada
		System.out.println(numbers.substring(7)); // 78
	}
}
