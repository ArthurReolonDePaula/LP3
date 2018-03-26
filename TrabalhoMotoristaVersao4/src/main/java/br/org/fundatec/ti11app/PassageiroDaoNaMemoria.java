package br.org.fundatec.ti11app;

import java.util.List;
import java.util.Optional;

public class PassageiroDaoNaMemoria implements PassageiroDao{
	
	private List<Passageiro> passageiros;
	
	public PassageiroDaoNaMemoria(List<Passageiro> passageiros) {
		this.passageiros = passageiros;
	}

	public Optional<Passageiro> buscarPorNome(String nome) {
		return passageiros.stream()
				.filter(passageiro -> passageiro.getNome().equals(nome))
				.findFirst();
	}
	@Override
	public void adicionar(Passageiro passageiro) {
		passageiros.add(passageiro);
		
		System.out.println("Passageiro(a) " + passageiros + " adicionado(a)");
	}
}
