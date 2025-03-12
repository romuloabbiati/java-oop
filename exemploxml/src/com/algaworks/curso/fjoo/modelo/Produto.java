package com.algaworks.curso.fjoo.modelo;

import java.math.BigDecimal;

public class Produto {
	
	public Long codigo;
	public String descricao;
	public BigDecimal valor;
	
	public Produto() {}
	
	public Produto(Long codigo, String descricao, BigDecimal valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
