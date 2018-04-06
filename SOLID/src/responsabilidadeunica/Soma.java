package responsabilidadeunica;

public class Soma extends Numeros{

	public Soma(int numero1, int numero2) {
		super(numero1, numero2);
	}

	@Override
	public int calcular() {
		int resultado = getNumero1() + getNumero2();
		return resultado;
	}
	
	
}
