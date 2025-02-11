package dft;

public class ArCondicionado {
	
	private int temperatura;
	
	public void trocarTemperatura(int temperatura) {
		if (temperatura >= 12 && temperatura <= 25) {
			this.temperatura = temperatura;
		}
	}
	
	public int obterTemperatura() {
		return temperatura;
	}
	
}
