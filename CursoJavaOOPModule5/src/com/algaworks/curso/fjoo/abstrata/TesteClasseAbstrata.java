package com.algaworks.curso.fjoo.abstrata;

public class TesteClasseAbstrata {
	
	public static void main(String[] args) {
		Produto p = new ProdutoPerecivel();
		p.descricao = "caixa de leite";
		
		ProdutoPerecivel pp = (ProdutoPerecivel) p;
		pp.dataValidade = "10/03/2025";
		
		pp.imprimirDescricao();
	}

}
