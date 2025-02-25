package com.algaworks.curso.fjoo.classemath;

import static java.lang.Math.PI;
import static java.lang.Math.max;

public class TesteClasseMath {
	
//	static final double PI = 3.1415;
	
	public static void main(String[] args) {
		// comprimento de uma circunferencia 2 x r x PI
		int raio = 4;
		double comprimento = 2 * raio * PI;
		System.out.println("Comprimento: " + comprimento);
		
		// maximo e minimo
		double[] precosProdutoA = { 30.20, 25.49 };
		double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
		double menorPreco = Math.min(precosProdutoA[0], precosProdutoA[1]);
		System.out.println("Maior preco: " + maiorPreco);
		System.out.println("Menor preco: " + menorPreco);
		
		// Potencia
		System.out.println("2^3: " + Math.pow(2, 3));
		
		// Raiz quadrada
		System.out.println("Raiz de 9: " + Math.sqrt(9));
		
		// Arredondamento ceil, floor e round
		double n = 5.68;
		System.out.println("Menor inteiro: " + Math.floor(n));
		System.out.println("Maior inteiro: " + Math.ceil(n));
		System.out.println("Arredondando: " + Math.round(n));
		
		// Trigonometria
		System.out.println("Seno: " + Math.sin(40));
		
		// Numero randomicos
		double numeroAleatorio = Math.random();
		System.out.println(numeroAleatorio);
		
	}

}
