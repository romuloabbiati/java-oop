package com.algaworks.curso.fjoo.regex;

public class ReplaceString {

	public static void main(String[] args) {
		String texto = "O valor do produto eh @xxxx@.";
		
		String novoTexto =  texto.replaceAll("@x+@", "2.50");
		
		System.out.println(texto);
		System.out.println(novoTexto);
		

	}

}
