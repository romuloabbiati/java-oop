package dft;

public class TestesClassesWrapper {

	public static void main(String[] args) {
		// byte, short, int,     long, float, double e char
		// Byte, Short, Integer, Long, Float, Double e Character
		
		int x = 5;
		
		// Integer i = new Integer(x); this is deprecated
		Integer i = Integer.valueOf(x);
		
		byte y = i.byteValue();
		// xxxValue();
		
		String valor = "15.5";
		float v = Float.valueOf(valor);
		System.out.println(v + 3);
		
		int idade = Integer.parseInt("38");
		System.out.println("Daqui a 5 anos voce tera " + (idade + 5) + " anos.");
		
		try {
			double custo = Double.parseDouble("Vinte e tres reais e cinquenta centavos");
			System.out.println("Custo total: " + custo);
		} catch (NumberFormatException e) {
			System.err.println("Numero invalido para conversao.");
		}

	}

}
