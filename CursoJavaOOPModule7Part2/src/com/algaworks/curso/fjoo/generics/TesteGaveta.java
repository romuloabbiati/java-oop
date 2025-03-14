package com.algaworks.curso.fjoo.generics;

public class TesteGaveta {

	public static void main(String[] args) {
		
		Gaveta<String> gaveta = new Gaveta<>();
		gaveta.colocar("Livro de Java");
		
		System.out.println(gaveta.retirarPrimeiro());
		
		Gaveta<Integer> gavetaDeNumeros = new Gaveta<Integer>();
		gavetaDeNumeros.colocar(4);
		
		System.out.println(gavetaDeNumeros.retirarPrimeiro() + 2);

	}

}
