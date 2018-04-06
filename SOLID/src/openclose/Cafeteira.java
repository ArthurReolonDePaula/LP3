package openclose;

public class Cafeteira extends Eletrodomestico {

	public Cafeteira(boolean statusEletrodomestico) {
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
