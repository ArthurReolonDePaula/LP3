package openclose;

public abstract class Eletrodomestico implements InterfaceEletrodomestico{
	
	private boolean statusEletrodomestico;

	public Eletrodomestico(boolean statusEletrodomestico) {
		super();
		this.statusEletrodomestico = statusEletrodomestico;
	}
 
	public final void setStatusEletrodomestico(boolean statusEletrodomestico) {
		this.statusEletrodomestico = statusEletrodomestico;
	}

	public final boolean isStatusEletrodomestico() {
		return statusEletrodomestico;
	}
}
