package dft;

public class Carro {
	
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	boolean biCombustivel;
	
	Proprietario dono;
	
	void ligar() {
		System.out.println("Ligando o carro: " + modelo);
	}

}
