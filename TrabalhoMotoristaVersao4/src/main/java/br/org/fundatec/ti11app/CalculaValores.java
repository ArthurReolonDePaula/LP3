package br.org.fundatec.ti11app;

import java.time.LocalDate;

public interface CalculaValores {
    // calcula valor que o motorista ira receber
    Double calcularValorMotorista(Motorista motorista, LocalDate dataInicio, LocalDate dataFim);

    // calcula o valor devido pelo passageiro
    //double calcularValorPassageiro(Viagem viagem, Passageiro passageiro);
}
