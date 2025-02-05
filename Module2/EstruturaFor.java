import java.util.Scanner;

public class EstruturaFor {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Digite ultimo numero: ");
    int numeroFinal = entrada.nextInt();

    for (int i = 0; i <= numeroFinal; i++) {
      System.out.println(i);
    }

    entrada.close();
  }

}
