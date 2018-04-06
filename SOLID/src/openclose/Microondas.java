package openclose;

public class Microondas extends Eletrodomestico {

	public Microondas(boolean statusEletrodomestico) {
		super(statusEletrodomestico);
	}

	@Override
	public boolean ligar() {
		if(!isStatusEletrodomestico()) {
			setStatusEletrodomestico(true);
		}
		return false;
	}
	
}
