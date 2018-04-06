package segregacaointerface;


public class Mecanico {
	public static void main(String[] args) {
		
	Carro carro = new Carro(true, true, true, 4, 4);
	Moto moto = new Moto(false, true, false, 0, 2);
	
	System.out.println("MOTOR DO CARRO: ");
	System.out.println(" ");
	System.out.println("O status do motor é: " + carro.isStatusMotor());
	carro.desligarMotor();
	System.out.println("Desligando o motor...");
	System.out.println("O status do motor é: " + carro.isStatusMotor());
	carro.ligarMotor();
	System.out.println("Ligando o motor... VRUM VRUM!");
	System.out.println("O status do motor é: " + carro.isStatusMotor());
	System.out.println("---------------------------------------------------------------------");
	System.out.println("MOTOR DA MOTO: ");
	System.out.println(" ");
	System.out.println("O status do motor é: " + moto.isStatusMotor());
	moto.ligarMotor();
	System.out.println("Ligando o motor... VRUM VRUM!");
	System.out.println("O status do motor é: " + moto.isStatusMotor());
	moto.desligarMotor();
	System.out.println("Desligando o motor...");
	System.out.println("O status do motor é: " + moto.isStatusMotor());
	}
}
