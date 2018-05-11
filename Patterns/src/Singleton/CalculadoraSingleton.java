package Singleton;

public class CalculadoraSingleton {

	private static CalculadoraSingleton INSTANCIA;

	private int numero1;
	private int numero2;

	private CalculadoraSingleton() {
	}

	public static CalculadoraSingleton getInstancia() {
		if (INSTANCIA == null) {
			INSTANCIA = new CalculadoraSingleton();
		}
		return INSTANCIA;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int deveCalcularSoma(int numero1, int numero2) {
		int resultado = (numero1 + numero2);
		return resultado;
	}
	
	public int deveCalcularSubtracao(int numero1, int numero2) {
		int resultado = (numero1 - numero2);
		return resultado;
	}
}
