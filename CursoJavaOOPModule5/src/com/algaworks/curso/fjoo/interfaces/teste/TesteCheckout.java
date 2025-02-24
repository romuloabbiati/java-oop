package com.algaworks.curso.fjoo.interfaces.teste;

import com.algaworks.curso.fjoo.interfaces.caixa.Checkout;
import com.algaworks.curso.fjoo.interfaces.caixa.Compra;
import com.algaworks.curso.fjoo.interfaces.impressao.Impressora;
import com.algaworks.curso.fjoo.interfaces.impressao.impressoras.ImpressoraHP;
import com.algaworks.curso.fjoo.interfaces.pagamento.Cartao;
import com.algaworks.curso.fjoo.interfaces.pagamento.Operadora;
import com.algaworks.curso.fjoo.interfaces.pagamento.operadoras.Amex;

public class TesteCheckout {
	
	public static void main(String[] args) {
		Operadora operadora = new Amex();
		Impressora impressora = new ImpressoraHP();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Joao M Couves");
		cartao.setNumeroCartao("456");
		
		Compra compra = new Compra();
		compra.setNomeCliente("Joao Mendonca Couves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(2.5);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}

}
