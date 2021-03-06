package br.org.fundatec.ti11app;

import java.util.Optional;

public interface PassageiroDao {
    Optional<Passageiro> buscarPorNome(String nome);
    void adicionar(Passageiro passageiro);
}
