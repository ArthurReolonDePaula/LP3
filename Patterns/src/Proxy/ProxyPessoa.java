package Proxy;

public class ProxyPessoa implements Pessoa {
	private String id;
	private Pessoa pessoa;
	
	public ProxyPessoa(String id) {
		this.id = id;
	}

	@Override
	public String getNome() {
		if(pessoa == null) {
			pessoa = PessoaDao.getPessoaByID(this.id);
			//Apenas cria o objeto real quando chamar esse método//
		}
		//Delega para o objeto real//
		return pessoa.getNome();
	}

	@Override
	public String getId() {
		return this.id;
	}
}
