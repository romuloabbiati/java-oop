package mod5exercicio24;

public class Barco implements Seguravel {
	
	private double valorMercado;
	private int anoFabricacao;

	public Barco(double valorMercado, int anoFabricacao) {
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.03;
		
		if (anoFabricacao < 2000) {
			valorApolice = this.valorMercado * 0.8;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Barco ano " + this.anoFabricacao + " com valor de mercado " + 
				this.valorMercado;
	}

}
