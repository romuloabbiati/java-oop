package desafioheranca;

public class ContaReceber extends Conta {
	
	protected Cliente cliente;
	
	public ContaReceber() {}
	
	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	public void receber() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Nao pode receber uma conta que jah estah paga: " + 
					this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Nao pode receber uma conta que estah cancelada: " + 
					this.getDescricao() + ".");
		} else {
			System.out.println("Recebendo conta " + this.getDescricao() + " no valor de " 
					+ this.getValor() + " e vencimento em " + this.getDataVencimento() + " do cliente " + 
					this.getCliente().getNome() + ".");
			
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}
	
	public void cancelar() {
		if (this.getValor() >= 50000d) {
			System.out.println("Essa conta a receber nao pode ser cancelada. " + 
					"Eh muito dinhieor para deixar de receber: " + this.getDescricao());
		} else {
			super.cancelar();
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
