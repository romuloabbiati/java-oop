package com.algaworks.curso.fjoo.collections;

import java.util.Set;

public class TesteSetHashSet2 {

	public static void main(String[] args) {
		Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();
		
		Aluno alunoSorteado = new Aluno("Elena");
		
		if (alunos.contains(alunoSorteado)) {
			System.out.println("Parabens voce " + alunoSorteado.getNome() + " foi sorteada e ganhou um brinde!");
		} else {
			System.out.println("Aluno nao cadastrado no banco de dados.");
		}

	}

}
