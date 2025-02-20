package desafioheranca;

public class Conta {
	
	private String descricao;
	private Double valor;
	private String dataVencimento;
	
	protected SituacaoConta situacaoConta;
	
	public Conta() {}
	
	public void cancelar() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Nao pode cancelar uma conta que jah foi paga: " + this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Nao pode cancelar uma conta que jah foi cancelada: " + this.getDescricao());
		} else {
			System.out.println("Cancelando conta " + this.getDataVencimento() + ".");
			
			this.situacaoConta = SituacaoConta.CANCELADA;
		}
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

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
	
}
