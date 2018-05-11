package FactoryMethod;

public class App {
	public static void main(String[] args) {

		FabricaDeChocolate chocolate = new FabricaDeChocolate();
		FabricaDeSalgado salgado = new FabricaDeSalgado();
		
		System.out.println(chocolate.fabricaProduto());
		System.out.println(" ");
		System.out.println(salgado.fabricaProduto());
	}
}