package com.algaworks.curso.fjoo.jarfiles;

import java.util.Scanner;

/*
 * Essa classe eh util para fazer o calculo do iMC
 * @author Romulo Abbiati
 */

public class CalculoIMC {

	/**
	 * @exception Esse method lanca a excessao illegalArgumentException
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println();
		System.out.print("Digite sua altura: ");
		double altura = entrada.nextDouble();
		System.out.println();
		
		double imc = peso / (altura * altura);
		System.out.println("Seu imc eh: " + imc);
		
		entrada.close();
	}

}
