package mod5exercicio7;

public class ContaPagar {
	
	private String descricao;
	private Double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	
	ContaPagar() {}
	
	ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public void pagar() {
		System.out.println("Descricao: " + this.descricao);
		System.out.println("Valor: " + this.valor);
		System.out.println("Data vencimento: " + this.valor);
		System.out.println("Fornecedor: " + this.fornecedor.getNome());
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
