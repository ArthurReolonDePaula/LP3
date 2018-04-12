package br.org.fundatec.ti11app;

import br.org.fundatec.ti11app.calculadora.CalculadoraValoresImpl;
import br.org.fundatec.ti11app.motorista.TelaMotorista;
import br.org.fundatec.ti11app.motorista.MotoristaDaoNaMemoria;
import br.org.fundatec.ti11app.motorista.MotoristaService;
import br.org.fundatec.ti11app.passageiro.TelaPassageiro;
import br.org.fundatec.ti11app.passageiro.PassageiroDaoNaMemoria;
import br.org.fundatec.ti11app.passageiro.PassageiroService;
import br.org.fundatec.ti11app.viagem.*;

import java.util.Scanner;

public class ConfiguracaoSingletom {
	
	private static ConfiguracaoSingletom INSTANCIA;
	
	private ConfiguracaoSingletom () {
		
	}
	
	public static ConfiguracaoSingletom getInstancia() {
		if(INSTANCIA == null) {
			INSTANCIA = new ConfiguracaoSingletom();
		}
		return INSTANCIA;
	}
	
	public InterfaceDoUsuario getUI() {
		return new InterfaceDoUsuario(configMotoristaService(),
				configPassageiroService(),
				configViagemService(),
				configFormatadorDeData());
	}

	private FormatadorDeData configFormatadorDeData() {
		return new FormatadorDeData();
	}

	private ViagemService configViagemService() {
		return new ViagemService(new ViagemDaoNaMemoria());
	}

	private PassageiroService configPassageiroService() {
		return new PassageiroService(new PassageiroDaoNaMemoria(), new CalculadoraValoresImpl());
	}

	private MotoristaService configMotoristaService() {
		return new MotoristaService(new MotoristaDaoNaMemoria(), new CalculadoraValoresImpl());
	}

	private Scanner configScanner() {
		return new Scanner(System.in);
	}

	private TelaPassageiro configInterfacePassageiro() {
		return new TelaPassageiro(configPassageiroService(), configScanner());
	}

	private TelaMotorista configInterfaceMotorista(){
		return new TelaMotorista(configMotoristaService(), configScanner());
	}

	public InterfaceMenu configInterfaceMenu() {
		return new InterfaceMenu(configScanner(), configInterfacePassageiro(), configInterfaceMotorista());
	}
}
