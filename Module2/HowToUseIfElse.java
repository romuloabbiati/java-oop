
import java.util.Scanner;

public class HowToUseIfElse {

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

    if (imc < 18.5) {
      System.out.println("Abaixo do peso ideal");
    } else if (imc < 25) {
      System.out.println("Peso ideal");
    } else if (imc < 30) {
      System.out.println("Acima do peso");
    } else if (imc < 40) {
      System.out.println("Obesidade grau 1 ou 2");
    } else {
      System.out.println("Obesidade grau 3");
      System.out.println("Muito cuidado com o seu peso.");
    }

    scanner.close();
  }

}
