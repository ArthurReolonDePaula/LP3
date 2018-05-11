package FactoryMethod;

public class FabricaDeChocolate implements FabricaProduto {

	@Override
	public Produto fabricaProduto() {
		return new Chocolate("Diamente Negro", 11.50, 120, true);
	}
}
