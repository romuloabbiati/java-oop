package com.algaworks.curso.fjoo.strings;

public class TesteStrings {

	public static void main(String[] args) {
		// String, StringBuilder, StringBuffer
		
		String s = "Ola";
		s += " pessoal!";
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("Ola");
		sb.append(" pessoal!");
		
		String resultado = sb.toString();
		System.out.println(resultado);
		
		// StringBuffer is the same as StringBuilder but it's protected against multi threading. If you need a String with 
		// better performance, StringBuilder is the best, but if you're program works with many threads, StringBuffer is 
		// better.

	}

}
