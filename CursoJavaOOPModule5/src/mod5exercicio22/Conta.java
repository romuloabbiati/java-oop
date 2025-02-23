package mod5exercicio22;

public abstract class Conta {
	
	private String descricao;
	private Double valor;
	private String dataVencimento;
	
	protected SituacaoConta situacaoConta;
	
	public Conta() {
		situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public abstract void exibirDetalhes();
	
	public void cancelar() {
		if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode cancelar uma conta que já foi cancelada: " 
					+ this.getDescricao() + ".");
		} else if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode cancelar uma conta que já foi paga: " 
					+ this.getDescricao() + ".");
		} else {
			System.out.println("Cancelando conta " + this.getDescricao() + ".");
			
			this.situacaoConta = SituacaoConta.CANCELADA;
		}
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

}
