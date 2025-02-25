package com.algaworks.curso.fjoo.mod6exercicio3;

public class MegaSena {
	
	static final int NUMERO_MAXIMO = 60;
	static final int QUANTIDADE_NUMERO = 6;
	
	private int[] numerosSorteados;
	
	public void sortear() {
		this.numerosSorteados = new int[QUANTIDADE_NUMERO];
		
		for (int i = 1; i <= QUANTIDADE_NUMERO; i++) {
			int numeroSorteado = (int) Math.round(Math.random() * NUMERO_MAXIMO);
			System.out.println(numeroSorteado);
			
			if (!this.jaFoiSorteado(numeroSorteado) && numeroSorteado != 0) {
				this.numerosSorteados[i - 1] = numeroSorteado;
			} else {
				i--;
			}
		}
	}
	
	public void exibirNumeros() {
		for (int numeroSorteado : numerosSorteados) {
			System.out.print(numeroSorteado + " ");
		}
		// quebra de linha
		System.out.println();
	}

	private boolean jaFoiSorteado(int numero) {
		boolean resultado = false;
		for (int i = 0; i < this.numerosSorteados.length; i++) {
			if (this.numerosSorteados[i] == numero) {
				resultado = true;
				break;
			}
			
		}
		return resultado;
	}

}
