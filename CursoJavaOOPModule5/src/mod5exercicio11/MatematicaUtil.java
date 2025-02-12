package mod5exercicio11;

public class MatematicaUtil {
	
	public final static double PI = 3.14;
	
	
	// http://pt.wikipedia.org/wiki/Número_de_Fibonacci
	public static int calcularFibonacci(int posicao) {
		if (posicao < 2) {
			return posicao;
		}
		return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
	}
		
	public static double calcularAreaCirculo(double raio) {
		double areaCirculo = raio * raio * PI;
		return areaCirculo;
	}
	
}
