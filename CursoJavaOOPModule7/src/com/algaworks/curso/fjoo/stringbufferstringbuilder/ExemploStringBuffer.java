package com.algaworks.curso.fjoo.stringbufferstringbuilder;

public class ExemploStringBuffer {

	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer(); // thread-safe - use no context the concorrencia
		StringBuilder sb = new StringBuilder(); // non-thread-safe - consequentement eh mais rapido por nao ter que ficar verificando
		sb.append("Bem vindo ao curso de Java. ");
		sb.append("Fique a vontade para tirar as suas duvidas. ");
		sb.append("Estamos aqui para te ajudar.");
		
		System.out.println(sb.toString());
		
		sb.insert(26, " da AlgaWorks");
		
		System.out.println(sb.toString());
		
		// the main difference between StringBuffer and StringBuilder classes is that StringBuffer is thread safe and 
		// StringBuilder isn't

	}

}
