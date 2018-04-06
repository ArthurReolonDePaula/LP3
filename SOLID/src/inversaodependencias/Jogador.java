package inversaodependencias;

import java.util.Scanner;

public class Jogador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Guerreiro guerreiro = new Guerreiro("Golpe Heroico", "Raiva");
		Mago mago = new Mago("Bola de Fogo", "Mana");

		System.out.println("Nome do Guerreiro: ");
		String nomeGuerreiro = scanner.nextLine();
		guerreiro.setNome(nomeGuerreiro);
		
		System.out.println("Tipo de arma que deseja utilizar: ");
		String tipoArma = scanner.nextLine();
		guerreiro.setArma(tipoArma);
		
		System.out.println("Tipo de armadura(leve, media ou pesada): ");
		String tipoArmadura = scanner.nextLine();
		guerreiro.setTipoArmadura(tipoArmadura);
		
		System.out.println("Personagem Criado com Sucesso.");
		System.out.println(" ");
		System.out.println("Carregando...");
		System.out.println(" ");
		
		System.out.println("Nome do Guerreiro: " + guerreiro.getNome());
		System.out.println("Tipo de arma: " + guerreiro.getArma());
		System.out.println("Tipo de armadura: " + guerreiro.getTipoArmadura());
		System.out.println("Habilidade disponível: " + guerreiro.getHabilidade());
		System.out.println("Recurso utilizável: " + guerreiro.getRecurso());
		
		System.out.println(" ");
		
		System.out.println(guerreiro.atacar());
		System.out.println(guerreiro.defender());
		System.out.println(guerreiro.usarHabilidade());
		System.out.println(guerreiro.fugir());
		
		System.out.println("---------------------------------------------------------------------");
		
		System.out.println("Nome do Mago: ");
		String nomeMago = scanner.nextLine();
		mago.setNome(nomeMago);
		
		System.out.println("Tipo de arma que deseja utilizar: ");
		String tipoArmaa = scanner.nextLine();
		guerreiro.setArma(tipoArmaa);
		
		System.out.println("Tipo de armadura(leve, media ou pesada): ");
		String tipoArmaduraa = scanner.nextLine();
		guerreiro.setTipoArmadura(tipoArmaduraa);
		
		System.out.println("Personagem Criado com Sucesso.");
		System.out.println(" ");
		System.out.println("Carregando...");
		System.out.println(" ");
		
		System.out.println("Nome do Guerreiro: " + mago.getNome());
		System.out.println("Tipo de arma: " + mago.getArma());
		System.out.println("Tipo de armadura: " + mago.getTipoArmadura());
		System.out.println("Habilidade disponível: " + mago.getHabilidade());
		System.out.println("Recurso utilizável: " + mago.getRecurso());
		
		System.out.println(" ");
		
		System.out.println(mago.atacar());
		System.out.println(mago.defender());
		System.out.println(mago.usarHabilidade());
		System.out.println(mago.fugir());
	}
}
