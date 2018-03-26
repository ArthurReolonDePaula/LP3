package br.org.fundatec.ti11app;

import java.util.ArrayList;

public class Configuracao {
	public static InterfaceDoUsuario getUI() {
		return new InterfaceDoUsuario(new MotoristaService(new MotoristaDaoNaMemoria(new ArrayList<Motorista>()), new CalculaValoresImpl()), 
								  new PassageiroService(new PassageiroDaoNaMemoria(new ArrayList<Passageiro>())));
    }
}
