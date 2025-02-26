package com.algaworks.curso.fjoo.excecoes;

public class ContaCorrente {
	
	private double saldo;

	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double deposito) {
		if (deposito <= 0) {
			throw new IllegalArgumentException("O valor nao pode ser menor que zero.");
		}
		this.saldo += deposito;
	}
	
	public void sacar(double quantidade) throws SaldoInsuficienteException {
		double saldoTemp = this.saldo - quantidade;
		
		if (saldoTemp < 0) {
			throw new SaldoInsuficienteException("Voce nao possui saldo suficiente.");
		}
		
		this.saldo -= quantidade;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
