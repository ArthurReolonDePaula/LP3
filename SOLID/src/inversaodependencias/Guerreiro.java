package inversaodependencias;


public class Guerreiro extends Heroi{

	public Guerreiro(String habilidade, String recurso) {
		super(habilidade, recurso);
	}

	@Override
	public String atacar() {
		return "Atacando.";
	}

	@Override
	public String fugir() {
		return "Correndo.";
	}

	@Override
	public String defender() {
		return "Aparando com arma.";
	}

	@Override
	public String usarHabilidade() {
		return "Usando Golpe Heróico.";
	}
}
