package Observer;

public class Guerreiro extends Heroi {

	public Guerreiro(QuadroDeMissao quadroDeMissao) {
		this.quadroDeMissao = quadroDeMissao;
		quadroDeMissao.adicionar(this);
	}

	@Override
	public void pegarMissao() {
		System.out.println(" ");
		System.out.println("Guerreiro aceitou a missão: " + quadroDeMissao.getMissao());
		System.out.println("Guerreiro diz -> PORRRRAAADAAAAAAAA!!!...");
		System.out.println(" ");
	}
}
