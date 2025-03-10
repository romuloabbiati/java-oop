package com.algaworks.curso.fjoo.classestring;

public class ExemplosClasseString {
	
	public static void main(String[] args) {
		String nome = "Romulo";
		System.out.println(nome.toUpperCase());
		System.out.println(nome);
		
		nome = nome.toUpperCase();
		System.out.println(nome);
		
		// ------------------------------------------
		
		String s1 = "Romulo";
		String s2 = "Romulo";
		
		System.out.println("s1 == s2? " + (s1 == s2));
		
		String s3 = new String("Romulo");
		System.out.println("s1 == s3? " + (s1 == s3));
		
		System.out.println("s1.equals(s2)? " + s1.equals(s2));
		System.out.println("s3.equals(s1)? " + s3.equals(s1));
		
		String s4 = "RoMuLo";
		System.out.println("s1.equals(s4)? " + s1.equals(s4));
		System.out.println("s1.equalsIgnoreCase(s4)? " + s1.equalsIgnoreCase(s4));
		
	}

}
