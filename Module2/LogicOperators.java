
import java.util.Scanner;

public class LogicOperators {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();

    System.out.print("Digite seu peso: ");
    int peso = scanner.nextInt();

    System.out.print("Digite sua altura: ");
    double altura = scanner.nextDouble();

    System.out.print("Sexo (1 para 'M' ou outro numero para 'F'): ");
    char sexo = scanner.nextInt() == 1 ? 'M' : 'F';

    double imc = peso / (altura * altura);

    System.out.println("IMC de " + nome + ": " + imc);

    if (sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7) {
      System.out.println("Abaixo do peso");
    } else if (sexo == 'F' && imc <= 25.8) || (sexo == 'M' && imc <= 26.4) {
      System.out.println("No peso ideal");
    }
    
    scanner.close();
  }

}
