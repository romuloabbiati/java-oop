package com.algaworks.curso.fjoo.abstrata;

public class ProdutoPerecivel extends Produto {
	
	String dataValidade;

	@Override
	public void imprimirDescricao() {
		// digitar a logica
		System.out.println("Descricao: " + getDescricao() + ", vencendo em: " + dataValidade);
		
	}
	
	

}
