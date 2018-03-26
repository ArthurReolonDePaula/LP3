package br.org.fundatec.ti11app;

import java.time.LocalDate;

public class MotoristaService {
	
    private MotoristaDao motoristaDao;
    private CalculaValores calculaValores;

    public MotoristaService(MotoristaDao motoristaDao, CalculaValores calculaValores) {
        this.motoristaDao = motoristaDao;
        this.calculaValores = calculaValores;
    }

    public double calcularValorAReceber(String nome, LocalDate inicio, LocalDate fim) {
        return motoristaDao.buscarPorNome(nome)
                .map(motorista -> calculaValores.calcularValorMotorista(motorista, inicio, fim))
                .orElse(0.0);
    }

    public void adicionarMotorista(Motorista motorista) {
        if (motoristaDao.buscarPorNome(motorista.getNome()).isPresent()) {
            System.out.println("nome " + motorista.getNome() + " já¡ existe!");
            return;
        }
        motoristaDao.adicionar(motorista);
    }
    
    public Motorista buscaMotorista(String nome) {
    	return motoristaDao.buscarPorNome(nome).get();
    	
    }
}
