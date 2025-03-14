package com.algaworks.curso.fjoo.generics;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(new Funcionario("Elena"));
		funcionarios.add(new Funcionario("Isabela"));
		
//		funcionarios.add("Romulo");
		
//		for (int i = 0; i < funcionarios.size(); i++) {
//			Funcionario f = (Funcionario) funcionarios.get(i);
//			
//			System.out.println("Nome do funcionario: " + f.getNome());
//		}
		
		for (Funcionario f : funcionarios) {
			System.out.println("Nome do funcionario: " + f.getNome());
		}
		

	}

}
