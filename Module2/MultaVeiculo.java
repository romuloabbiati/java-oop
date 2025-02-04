import java.util.Scanner;

public class MultaVeiculo {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Tipo do veiculo (passeio, caminhao)");
    String tipoVeiculo = entrada.nextLine();

    System.out.println("Velocidade maxima da vida");
    int velocidadeMaxima = entrada.nextInt();

    System.out.println("Velocidade do veiculo");
    int velocidadeVeiculo = entrada.nextInt();

    /*
    if (tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1) {
      System.out.println("Multa");
    } else if (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05) {
      System.out.println("Multa");
    }
    */

    if ((tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1) || 
        (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05)) {
      System.out.println("Multa");
    }

    entrada.close();
  }

}
