package br.org.fundatec.ti11app;

public class Main {
    public static void main(String[] args) {
        InterfaceDoUsuario ui = Configuracao.getUI();
        ui.iniciar();
    }
}