package com.algaworks.curso.fjoo.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {
	
	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		double valorProduto = 1300.59;
		
		System.out.println(valorProduto);
		
		System.out.println(formatador.format(valorProduto));
		
		String entrada = "R$ 50.34";
		
		try {
			double numero = formatador.parse(entrada).doubleValue();
			System.out.println("Numero: " + numero);
		} catch (ParseException e) {
			System.out.println("Entrada invalida.");
		}
		
		BigDecimal bg = new BigDecimal(512345234534324d);
		bg = bg.divide(BigDecimal.TEN);
	}

}
