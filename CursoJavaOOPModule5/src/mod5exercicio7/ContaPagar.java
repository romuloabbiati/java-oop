package mod5exercicio7;

public class ContaPagar {
	
	private String descricao;
	private Double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	private SituacaoConta situacaoConta;
	
	ContaPagar() {
		situacaoConta = SituacaoConta.PENDENTE;
	}
	
	ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this();
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public void pagar() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Nao pode pagar uma conta que jah estah paga: " + this.getDescricao());
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Nao pode pagar uma conta que estah cancelada: " + this.getDescricao());
		} else {
			System.out.println("Pagando conta " + this.getDescricao() + " no valor de " 
					+ this.getValor() + " e vencimento em " + this.getDataVencimento() 
					+ " do fornecedor " + this.getFornecedor().getNome() + ".");		
			
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}	
	
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

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
