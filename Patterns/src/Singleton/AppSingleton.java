package Singleton;

import java.util.Scanner;

public class AppSingleton {
	public static void main(String[] args) {

		AppSingleton app = new AppSingleton();
		app.calcularSomaComSingleton();
		app.calcularSubtracaoComSingleton();
		app.calcularSomaSemSingleton();
	}

	Scanner scanner = new Scanner(System.in);

	private void calcularSomaComSingleton() {
		System.out.println("CALCULANDO SOMA COM SINGLETON");
		System.out.println(" ");
		System.out.println("Digite dois números para somar: ");
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();

		CalculadoraSingleton.getInstancia().setNumero1(numero1);
		CalculadoraSingleton.getInstancia().setNumero2(numero2);

		System.out.println(
				"Resultado da soma: " + CalculadoraSingleton.getInstancia().deveCalcularSoma(numero1, numero2));
		System.out.println(" ");
	}

	private void calcularSubtracaoComSingleton() {
		System.out.println("CALCULANDO SUBTRACAO COM SINGLETON");
		System.out.println(" ");
		System.out.println("Digite dois números para subtrair: ");
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();

		CalculadoraSingleton.getInstancia().setNumero1(numero1);
		CalculadoraSingleton.getInstancia().setNumero2(numero2);

		System.out.println("Resultado da Subtração: "
				+ CalculadoraSingleton.getInstancia().deveCalcularSubtracao(numero1, numero2));
		System.out.println("---------------------------------------------------------------");
	}

	private void calcularSomaSemSingleton() {
		System.out.println("Calculando SOMA SEM singleton");
		System.out.println(" ");
		System.out.println("Digite dois números para somar: ");
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();

		Calculadora calculadora = new Calculadora();
		calculadora.setNum1(numero1);
		calculadora.setNum2(numero2);

		System.out.println("Resulado da soma: " + calculadora.deveCalcularSoma(numero1, numero2));
		System.out.println(" ");
	}
}
