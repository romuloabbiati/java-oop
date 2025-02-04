import java.util.Scanner;

public class OperadorTernario {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite sua idade: ");
    int idade = entrada.nextInt();
   
     /*
    if (idade >= 18) {
      indicacao = "adulto";
    } else {
      indicacao = "crianca/adolescente";
    }
    */

    String indicacao = (idade >= 18) ? "adulto" : "crianca/adolescente";

    System.out.println("Resultado: " + indicacao);

    entrada.close();
  }

}
