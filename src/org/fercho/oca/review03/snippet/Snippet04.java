package org.fercho.oca.review03.snippet;

public class Snippet04 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("aaa").insert(1, "bb").insert(4, "ccc"); //aaa -> abbaa -> abbaccca
		System.out.println(sb);
	}
}
