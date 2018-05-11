package Observer;

public class Mago extends Heroi {

	public Mago(QuadroDeMissao quadroDeMissao) {
		this.quadroDeMissao = quadroDeMissao;
		quadroDeMissao.adicionar(this);
	}

	@Override
	public void pegarMissao() {
		System.out.println(" ");
		System.out.println("Mago aceitou a miss�o: " + quadroDeMissao.getMissao());
		System.out.println("Mago diz -> Ok, vou fazer um teleporte porque to com pregui�a.");
		System.out.println(" ");
	}
}
