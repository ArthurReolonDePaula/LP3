package responsabilidadeunica;

import java.util.Scanner;

public class AppCalculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	System.out.println("Digite 1° numero: ");
	int num1 = scanner.nextInt();
	
	System.out.println("Digite 2° numero:");
	int num2 = scanner.nextInt();
	
	Soma soma = new Soma(num1, num2);
	soma.calcular();
	System.out.println("Resultado da soma: " + soma.calcular());
	
	Subtracao subtracao = new Subtracao(num1, num2);
	subtracao.calcular();
	System.out.println("Resultado da Subtração: " + subtracao.calcular());
}
}
