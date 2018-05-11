package Proxy;
/**
 * Classe que faz o acesso ao banco de dados.
 */
class PessoaDao {
	public static Pessoa getPessoaByID(String id) {
		System.out.println("select*from PESSOA where id=" + id);
		return new PessoaImplements(id, "Pessoa" + id);
	}
}
