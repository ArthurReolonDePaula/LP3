package Proxy;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
	//Cria cada proxy para encapsular o acesso a classe PessoaImplements//
		listaDePessoas.add(new ProxyPessoa("A"));
		listaDePessoas.add(new ProxyPessoa("B"));
		listaDePessoas.add(new ProxyPessoa("C"));
		
		System.out.println("Nome: " + listaDePessoas.get(0).getNome()); //Busca no banco o dado.
		System.out.println("Nome: " + listaDePessoas.get(1).getNome()); //Busca no Banco o dado.
		System.out.println("Nome: " + listaDePessoas.get(0).getNome()); //Já buscou anteriormente, apenas retorna o cache
	}
}
