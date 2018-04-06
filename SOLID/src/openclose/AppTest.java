package openclose;

public class AppTest {
	public static void main(String[] args) {

		Cafeteira cafeteira = new Cafeteira(false);
		Microondas microondas = new Microondas(false);
		Pessoa pessoa = new Pessoa();

		System.out.println("Status atual da cafeteira: " + cafeteira.isStatusEletrodomestico());
		pessoa.ligar(cafeteira);
		System.out.println("Ligando a cafeteira...");
		System.out.println("Status atual da cafeteira: " + cafeteira.isStatusEletrodomestico());

		System.out.println("-------------------------------------------------------------------------");

		System.out.println("Status atual do microondas: " + microondas.isStatusEletrodomestico());
		pessoa.ligar(microondas);
		System.out.println("Ligando o microondas...");
		System.out.println("Status atual do microondas: " + microondas.isStatusEletrodomestico());

	}
}
