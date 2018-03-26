package br.org.fundatec.ti11app;

public class PassageiroService {

	private PassageiroDao passageiroDao;
	
	
	 public PassageiroService(PassageiroDao passageiroDao) {
		this.passageiroDao = passageiroDao;
	}

	public double calcularValorDevido(Viagem viagem, Passageiro passageiro) {
		double resultado =viagem.getQuantidadeMinutos() * 0.50 + viagem.getKmRodado() * 0.20;
		return resultado + (resultado * 0.15);
	}
	
	public void adicionarPassageiro(Passageiro passageiro) {
	    	if(passageiroDao.buscarPorNome(passageiro.getNome()).isPresent()) {
	    		System.out.println("nome" + passageiro.getNome() + " já existe!");
	    		return;
	    	}
	    	passageiroDao.adicionar(passageiro);
	    }
}
