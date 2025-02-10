package mod4exercicio5;

public class Estoque {
	
	Produto[] produtos;
	
	void listarProdutos() {
		System.out.println("\nProdutos em estoque");
		System.out.println("------------------------");
		
		for (int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
		}
	}
	
	int mostrarTotalProdutos() {
		Integer totalProdutos = 0;
		
		for (int i = 0; i < produtos.length; i++) {
			totalProdutos += produtos[i].quantidade;
		}
		
		return totalProdutos;
	}

}
