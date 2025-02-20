package desafioheranca;

public class ContaPagar extends Conta {
	
	protected Fornecedor fornecedor;
	
	public ContaPagar() {}
	
	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}
	
	public void pagar() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Nao pode pagar uma conta que jah estah paga: "
					+ this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Nao pode pagar uma conta que estah cancelada: "
					+ this.getDescricao() + ".");
		} else {
			System.out.println("Pagando conta " + this.getDescricao() + " no valor de "
					+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
					+ " do fornecedor " + this.getFornecedor().getNome() + ".");
			
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
