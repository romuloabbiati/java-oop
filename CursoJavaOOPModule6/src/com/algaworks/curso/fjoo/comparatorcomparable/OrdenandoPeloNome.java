package com.algaworks.curso.fjoo.comparatorcomparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPeloNome {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Isabela", 33);
		Pessoa p2 = new Pessoa("Elena", 0);
		Pessoa p3 = new Pessoa("Romulo", 38);
		
		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
		Collections.sort(pessoas);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}

	}

}
