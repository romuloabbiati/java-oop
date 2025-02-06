package petshop;

public class PetShop {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Bidu";
		cachorro.idade = 1;
		cachorro.raca = "Boxer";
		cachorro.sexo = 'M';
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.nome = "Brad";
		cachorro2.idade = 2;
		cachorro2.raca = "Pinscher";
		cachorro2.sexo = 'M';
		
		System.out.println("Cachorro 1 ----------------");
		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Idade: " + cachorro.idade);
		System.out.println("Raca: " + cachorro.raca);
		System.out.println("Sexo: " + cachorro.sexo);
		
		System.out.println();
		
		System.out.println("Cachorro 2 ----------------");
		System.out.println("Nome: " + cachorro2.nome);
		System.out.println("Idade: " + cachorro2.idade);
		System.out.println("Raca: " + cachorro2.raca);
		System.out.println("Sexo: " + cachorro2.sexo);

	}

}
