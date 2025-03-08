package com.algaworks.curso.fjoo.comparatorcomparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPelaIdade {
	
public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Romulo", 38);
		Pessoa p2 = new Pessoa("Isabela", 33);
		Pessoa p3 = new Pessoa("Elena", 0);
		
		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
		IdadeComparator idadeComparator = new IdadeComparator();
		
//		Collections.sort(pessoas, idadeComparator); // metodo antigo de fazer comparacao
		pessoas.sort(idadeComparator); // metodo adicionado a partir do java 8
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}

	}

}
