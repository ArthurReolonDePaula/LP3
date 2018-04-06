package liskov;

public class Paladino implements Heroi{

	@Override
	public boolean espada() {
		return true;
	}

	@Override
	public boolean escudo() {
		return true;
	}

	@Override
	public boolean armaduraPlaca() {
		return true;
	}
	
	//Ferir o liskov é quando vc tem um metodo publico em uma classe concreta que nao esta na interface
	
}
