package com.algaworks.curso.fjoo.regex;

public class SplitString {

	public static void main(String[] args) {
		
		String texto = "O44Java2eh3uma9linguagem9orientada1a7objetos.";
		
		String[] palavras = texto.split("\\d+");
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}

	}

}
