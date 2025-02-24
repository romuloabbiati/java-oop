package com.algaworks.curso.fjoo.interfaces.pagamento;

public interface Operadora {
	
	public abstract boolean autorizar(Autorizavel autorizavel, Cartao cartao);

}
