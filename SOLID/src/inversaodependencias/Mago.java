package inversaodependencias;

public class Mago extends Heroi{

	public Mago(String habilidade, String recurso) {
		super(habilidade, recurso);
	}

	@Override
	public String atacar() {
		return "Atacando...";
	}

	@Override
	public String fugir() {
		return "Usando Teletransporte...";
	}

	@Override
	public String defender() {
		return "Escudo de Gelo...";
	}

	@Override
	public String usarHabilidade() {
		return "Castando Bola de Fogo...";
	}
}
