package com.algaworks.curso.fjoo.heritage;

public class TesteHeranca {

	public static void main(String[] args) {
		Jogador j = new Jogador();
		j.nome = "Romulo";
		j.idade = 38;
		
		j.seApresentar();
		j.dizerSeAindaJoga();
		
		Pessoa p = new Pessoa();
//		p.dizerSeAindaJoga();

	}

}
