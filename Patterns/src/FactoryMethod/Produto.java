package FactoryMethod;

public abstract class Produto {

	private String nome;
	private double preco;
	private int quantidade;
	private boolean estoque;

	public Produto(String nome, double preco, int quantidade, boolean estoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.estoque = estoque;
	}

	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final double getPreco() {
		return preco;
	}

	public final void setPreco(double preco) {
		this.preco = preco;
	}

	public final int getQuantidade() {
		return quantidade;
	}

	public final void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public final boolean isEstoque() {
		return estoque;
	}

	public final void setEstoque(boolean estoque) {
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + ", estoque=" + estoque
				+ "]";
	}
}
