package Proxy;

public class PessoaImplements implements Pessoa {

	/**
	 * Objeto Real
	 */

	private String nome;
	private String id;

	public PessoaImplements(String nome, String id) {
		this.nome = nome;
		this.id = id;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public String getId() {
		return this.id;
	}
}
