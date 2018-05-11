package FactoryMethod;

public class FabricaDeSalgado implements FabricaProduto {

	@Override
	public Produto fabricaProduto() {
		return new Salgado("Cheetos", 8.50, 0, false);
	}
}
