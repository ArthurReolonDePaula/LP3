package segregacaointerface;

public class Carro extends VeiculoAutomotivo {
	
	public Carro(boolean statusMotor, boolean motor, boolean freio, int numeroPortas, int numeroRodas) {
		super(statusMotor, motor, freio, numeroPortas, numeroRodas);
	}

	@Override
	public boolean ligarMotor() {
		if(!isStatusMotor()) {
			setStatusMotor(true);
			return true;
		} 
		return false;
		
	}

	@Override
	public boolean desligarMotor() {
		if(isStatusMotor()) {
			setStatusMotor(false);
			return false;
		}
		return true;
	}
}
