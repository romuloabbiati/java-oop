package com.algaworks.curso.fjoo.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Elena");
		Aluno a2 = new Aluno("Isabela");
		Aluno a3 = new Aluno("Romulo");
		Aluno a4 = new Aluno("Rosinella");
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a4);
		
		imprimirAlunos(alunos);

	}
	
	public static void imprimirAlunos(List<Aluno> alunos) {
		for (Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());
		}
	}

}
