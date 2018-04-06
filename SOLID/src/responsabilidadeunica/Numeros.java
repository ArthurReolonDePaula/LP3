package responsabilidadeunica;

public abstract class Numeros implements MetodoCalcular {
	private int numero1;
	private int numero2;
	
	public Numeros(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	public final int getNumero1() {
		return numero1;
	}
	public final void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public final int getNumero2() {
		return numero2;
	}
	public final void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	
}
