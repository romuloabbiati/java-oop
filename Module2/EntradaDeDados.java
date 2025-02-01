import java.util.Scanner;

public class EntradaDeDados {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();

    System.out.print("Digite seu peso: ");
    int peso = scanner.nextInt();

    System.out.print("Digite sua altura: ");
    double altura = scanner.nextDouble();

    double imc = peso / (altura * altura);

    System.out.println("IMC de " + nome + ": " + imc);

    scanner.close();
  }

}
