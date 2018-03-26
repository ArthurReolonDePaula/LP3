package br.org.fundatec.ti11app;

import java.time.LocalDate;
import java.util.Scanner;

public class InterfaceDoUsuario {

    private MotoristaService motoristaService;
    private PassageiroService passageiroService;
    private Scanner scanner;

    public InterfaceDoUsuario(MotoristaService motoristaService, PassageiroService passageiroService) {
		super();
		this.motoristaService = motoristaService;
		this.passageiroService = passageiroService;
		this.scanner = new Scanner(System.in);
	}

	public void iniciar() {
        boolean sair = true;
        while (sair) {
        	System.out.println(" ");
            System.out.println("Bem vindo!");
            System.out.println("Digite um número para escolher a opção desejada");
            System.out.println("1 - adicionar passageiro");
            System.out.println("2 - adicionar motorista");
            System.out.println("3 - adicionar viagem");
            System.out.println("4 - calcular valor devido de um passageiro");
            System.out.println("5 - calcular valor que o motorista deve recebe");
          
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarPassageiro();
                    break;
                case 2:
                    adicionarMotorista();
                    break;
                case 3:
                    adicionarViagem();
                    break;
                case 4:
                    calcularValorDevidoDoPassageiro();
                    break;
                case 5:
                    calcularValorAReceberMotorista();
                    break;
                default:
                    System.out.println("Opção não encontrada");
                    sair = false;
                    break;
            }
        }
    }

	private void adicionarPassageiro() {
		System.out.println("Digite o nome do passageiro: ");
		Passageiro nomePassageiro = new Passageiro(scanner.next());
		passageiroService.adicionarPassageiro(nomePassageiro);
		System.out.println("Passageiro adicionado com sucesso! :D");
    }

    private void adicionarMotorista() {
        System.out.println("Digite o nome do motorista:");
        String nomeMotorista = scanner.next();
        motoristaService.adicionarMotorista(new Motorista(nomeMotorista));
        System.out.println("Motorista adicionado com sucesso! :D");
    }

    private void adicionarViagem() {
        // TODO chamar adição da viagem
        System.out.println("Informe o nome do passageiro: ");
        String nomePassageiro = scanner.next();

        System.out.println("Informe o nome do motorista que o transportou: ");
        String nomeMotorista = scanner.next();

        System.out.println("Informe a quantidade de km rodados: ");
        double kmRodados = scanner.nextDouble();

        System.out.println("Informe a quantidade de minutos: ");
        int quantidadeMinutos = scanner.nextInt();

        System.out.println("Informe a data: ");
        LocalDate date = formatDate(scanner.next());

        Viagem viagem = new Viagem(nomePassageiro, kmRodados, quantidadeMinutos, date);
        Motorista motorista = motoristaService.buscaMotorista(nomeMotorista);
        motorista.adicionaViagensAoMotorista(viagem);
        System.out.println("Viagem adicionada com sucesso! :D");
    }

    private void calcularValorDevidoDoPassageiro() {
        System.out.println("Informe o nome do Passageiro: ");
        String nomePassageiro = scanner.next();
        
        System.out.println("Informe a quantidade de km rodados: ");
        double kmRodados = scanner.nextDouble();
        
        System.out.println("Informe a quantidade de minutos: ");
        int quantidadeMinutos = scanner.nextInt();
        
        System.out.println("Informe a data: ");
        LocalDate date = formatDate(scanner.next());
        
        System.out.println(" ");
        System.out.println("Loading...");
        System.out.println(" ");
        
        Passageiro passageiro = new Passageiro(nomePassageiro);
        Viagem viagem = new Viagem(nomePassageiro, kmRodados, quantidadeMinutos, date);
        double result = passageiroService.calcularValorDevido(viagem, passageiro);
        
        System.out.println("Valor devido pelo passageiro " + passageiro.getNome() + " é de: " + result + " Reais.");
    }

    private void calcularValorAReceberMotorista() {
        System.out.println("Informe o nome do motorista:");
        String nomeMotorista = scanner.next();
        System.out.println("Informe a data inicio:");
        String dataInicio = scanner.next();
        //2018-03-21 <- formato data
        System.out.println("Informe a data de fim");
        String datafim = scanner.next();

        LocalDate inicio = formatDate(dataInicio);
        LocalDate fim = formatDate(datafim);

        System.out.println(inicio + " " + fim);
        
        double result = motoristaService.calcularValorAReceber(nomeMotorista, inicio, fim);
        
        System.out.println(" ");
        System.out.println("Loading...");
        System.out.println(" ");
        
        System.out.println("Motorista deve receber: " + result + " Reais");
     
    }

    private LocalDate formatDate(String dataText) {
        return LocalDate.parse(dataText);
    }
}