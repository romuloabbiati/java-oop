package com.algaworks.curso.fjoo.javadoc;

/**
 * Representa o funcionario de uma empresa
 * 
 * @author Romulo Abbiati
 * @author Isabela Goto Abbiati
 * @author Elena Goto Abbiati
 */
public class Funcionario {
	
	private String nome;
	private double salario;
	
	/**
	 * 
	 * Nao utilize mais, pois o salario eh obrigatorio e precisa ser informado
	 * 
	 * @deprecated
	 * @param nome
	 */
	public Funcionario(String nome) {
		this.nome = nome;
	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * 
	 * Calcula o adiantamento em dinheiro que devera ser pago ao funcionario.
	 * 
	 * <p>O valor a diaria eh calculada dividindo-se o <b>salario base por 30 (dias do mes).</b></p>
	 * 
	 * Caso o destino for uma capital, eh adicionado 20% ao valor do adiantamento.
	 * 
	 * @param 	dias
	 * 			Quantidade de dias de viagem			
	 * 
	 * @param 	capital
	 * 			Indica se eh uma capital Brasileira			
	 * 
	 * @return	O valor do adiantamento em reais.
	 * 
	 * @throws	IllegalArgumentException
	 * 			Caso {@code dias} for menor ou igual a zero
	 * 
	 * @since	1.1.0
	 * 
	 * @see 	Viagem
	 */
	public double adiantamentoViagem(int dias, boolean capital) {
		if (dias <= 0) {
			throw new IllegalArgumentException("Dias deve ser maior que zero.");
		}
		
		double valorDiaria = salario / 30;
		
		double valorAdiantamento = valorDiaria * dias;
		
		if (capital) {
			valorAdiantamento *= 1.2;
		}
		
		return valorAdiantamento;
	}
	
}
