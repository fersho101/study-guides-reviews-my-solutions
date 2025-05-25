package org.fercho.oca.review03.snippet;

/*
Which of these array declarations is not legal? (Choose all that apply)
A. int[][] scores = new int[5][];
B. Object[][][] cubbies = new Object[3][0][5];
C. String beans[] = new beans[6];
D. java.util.Date[] dates[] = new java.util.Date[2][];
E. int[][] types = new int[];
F. int[][] java = new int[][];
 */
public class Snippet15 {
	public static void main(String[] args) {
		int[][] scores = new int[5][]; // OK
		Object[][][] cubbies = new Object[3][0][5]; // OK
		// String beans[] = new beans[6]; // Se coloco el el nombre en lugar del tipo.
		java.util.Date[] dates[] = new java.util.Date[2][]; // OK
		// int[][] types = new int[]; // Faltan un par de conchetes y el index del
		// primero.
		// int[][] java = new int[][]; // Falta el index del primero por lo menos.
	}

}
