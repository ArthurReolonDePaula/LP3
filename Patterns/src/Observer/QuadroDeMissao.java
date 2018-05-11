package Observer;

import java.util.ArrayList;
import java.util.List;

public class QuadroDeMissao {
	
	private List<Heroi> herois = new ArrayList<>();
	private String missao;
	
	public String getMissao() {
		return missao;
	}

	public void entregar(String missao) {
		this.missao = missao;
		notificar();
	}
	
	public void notificar() {
		herois.forEach(s -> s.pegarMissao());
	}
	
	public void adicionar(Heroi heroi) {
		herois.add(heroi);
	}
}
