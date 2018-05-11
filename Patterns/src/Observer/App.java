package Observer;

public class App {
	public static void main(String[] args) {
		QuadroDeMissao quadroDeMissao = new QuadroDeMissao();
		new Guerreiro(quadroDeMissao);
		new Mago (quadroDeMissao);
		
		quadroDeMissao.entregar("Precisamos de ajuda urgente em VentoBravo!!");
		System.out.println(" ");
		quadroDeMissao.entregar("Controle de pragas.");
	}
}
