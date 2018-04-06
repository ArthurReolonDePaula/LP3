package liskov;

public class Guerreiro implements Heroi{

	@Override
	public boolean espada() {
		return true;
	}

	@Override
	public boolean escudo() {
		return false;
	}

	@Override
	public boolean armaduraPlaca() {
		return true;
	}
	
	
	
	
}
