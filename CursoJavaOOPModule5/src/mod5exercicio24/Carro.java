package mod5exercicio24;

public class Carro implements Seguravel {
	
	private double valorMercado;
	private int anoFabricacao;

	public Carro(double valorMercado, int anoFabricacao) {
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.04;
		
		if (anoFabricacao < 2000) {
			valorApolice = this.valorMercado * 0.9;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Carro ano " + this.anoFabricacao + " com valor de mercado " + 
				this.valorMercado;
	}

}
