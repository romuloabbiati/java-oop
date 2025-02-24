package mod5exercicio24;

public class Principal {

	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();
		
		Carro meuCarro = new Carro(45000d, 2012);
		Imovel minhaCasa = new Imovel(920000, 320);
		Barco meuBarco = new Barco(1500000, 2015);
		Notebook meuNotebook = new Notebook(4000, 2024);
		
		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
		corretora.fazerPropostaSeguro(meuBarco);
		corretora.fazerPropostaSeguro(meuNotebook);
	}
	
}
