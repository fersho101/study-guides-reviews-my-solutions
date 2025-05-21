package org.fercho.oca.review03.snippet;

public class Snippet09 {
	public static void main(String[] args) {
		
		String s = "purr";
		s.toUpperCase(); //PURR
		s.trim(); // PURR
		s.substring(1,3); // UR
		s+=" two"; // PURR two
		System.out.println(s.length()); //8

	}
}
