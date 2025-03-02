package mod6exercicio10;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Valor do produto: ");
		double valorProduto = entrada.nextDouble();
		
		BigDecimal bg = new BigDecimal(valorProduto);
		
		BigDecimal valorProdutoEmBigDecimal = bg.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
		
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		
		String valorFormatado = formatador.format(valorProdutoEmBigDecimal.doubleValue());
		
		System.out.println("10% do valor eh: " + valorFormatado);
		
		entrada.close();
	}

}
