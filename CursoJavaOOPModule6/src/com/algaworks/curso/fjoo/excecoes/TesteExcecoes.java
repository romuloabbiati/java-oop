package com.algaworks.curso.fjoo.excecoes;

public class TesteExcecoes {

	public static void main(String[] args) {
		// int numero = 5 / 0; // lanca java.lang.ArithmeticException
		
//		String s = null;
//		String sMaisculo = s.toUpperCase(); // lanca java.lang.NullPointerException
		
		ContaCorrente cc = new ContaCorrente(100);
		
		try {
			cc.depositar(-10);
			// executa uma logica de negocio aqui
		} catch (IllegalArgumentException e) {
			System.out.println("Voce executou uma operacao ilegal: " + e.getMessage());
		}
		
	}

}
