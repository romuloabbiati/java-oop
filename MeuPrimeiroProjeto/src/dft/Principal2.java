package dft;

public class Principal2 {

	public static void main(String[] args) {
//		Proprietario dono1 = new Proprietario();
//		dono1.nome = "Joao da Silva";
//		dono1.cpf = "000.000.000-00";
//		dono1.idade = 25;
//		dono1.logradouro = "Rua Joao Pinheiro, 10";
//		dono1.bairro  = "Centro";
//		dono1.cidade = "Uberlandia";
		
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Prata";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.dono = new Proprietario();
		meuCarro.dono.nome = "Joao da Silva";
		meuCarro.dono.bairro = "Centro";
	}

}
