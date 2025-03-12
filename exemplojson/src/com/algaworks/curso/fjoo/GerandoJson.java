package com.algaworks.curso.fjoo;

import java.util.ArrayList;
import java.util.List;

import com.algaworks.curso.fjoo.modelo.Cliente;
import com.algaworks.curso.fjoo.modelo.Endereco;
import com.algaworks.curso.fjoo.modelo.Telefone;
import com.google.gson.Gson;

public class GerandoJson {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Cadbury way", "London", "London");
		
		Telefone residencial = new Telefone("RESIDENCIAL", "07378373223");
		Telefone comercial = new Telefone("COMERCIAL", "07873737322");
		List<Telefone> telefones = new ArrayList<Telefone>();
		telefones.add(residencial);
		telefones.add(comercial);
		
		Cliente cliente = new Cliente("Romulo Abbiati", 38, endereco, telefones);
		
		Gson gson = new Gson();
		String json = gson.toJson(cliente);
		
		System.out.println(json);
		
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println();
		
		Cliente c2 = gson.fromJson(json, Cliente.class);
		
		System.out.println(c2.getNome());
		System.out.println(c2.getTelefones().get(0).getNumero());
		
		

	}

}
