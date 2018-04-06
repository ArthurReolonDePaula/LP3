package segregacaointerface;

public abstract class VeiculoAutomotivo implements Veiculo{
	
	private boolean statusMotor;
	private boolean motor;
	private boolean freio;
	private int numeroPortas;
	private int numeroRodas;
	
	public VeiculoAutomotivo(boolean statusMotor, boolean motor, boolean freio, int numeroPortas, int numeroRodas) {
		super();
		this.statusMotor = statusMotor;
		this.motor = motor;
		this.freio = freio;
		this.numeroPortas = numeroPortas;
		this.numeroRodas = numeroRodas;
	}

	public boolean isStatusMotor() {
		return statusMotor;
	}

	public void setStatusMotor(boolean statusMotor) {
		this.statusMotor = statusMotor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	public void setFreio(boolean freio) {
		this.freio = freio;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public boolean isMotor() {
		return motor;
	}

	public boolean isFreio() {
		return freio;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}
}
