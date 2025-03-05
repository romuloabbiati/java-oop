package com.algaworks.curso.fjoo.collections;

import java.util.HashSet;
import java.util.Set;

public class SimuladorBancoDeDados {
	
	public static Set<Aluno> buscarAlunos() {
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(new Aluno("Romulo"));
		alunos.add(new Aluno("Isabela"));
		alunos.add(new Aluno("Elena"));
		return alunos;
	}
	
}