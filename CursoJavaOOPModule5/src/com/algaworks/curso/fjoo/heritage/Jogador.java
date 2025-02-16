package com.algaworks.curso.fjoo.heritage;

public class Jogador extends Pessoa {

	protected boolean aindaJoda = false;
	
	public void dizerSeAindaJoga() {
		System.out.println("Ainda joga? " + aindaJoda);
	}
}
