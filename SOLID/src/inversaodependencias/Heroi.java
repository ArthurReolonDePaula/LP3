package inversaodependencias;

public abstract class Heroi implements InterfaceHeroi{
	private String nome;
	private String arma;
	private String tipoArmadura;
	private String habilidade;
	private String recurso;

	public Heroi(String habilidade, String recurso) {
		super();
		this.habilidade = habilidade;
		this.recurso = recurso;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public void setTipoArmadura(String tipoArmadura) {
		this.tipoArmadura = tipoArmadura;
	}

	public String getArma() {
		return arma;
	}

	public String getTipoArmadura() {
		return tipoArmadura;
	}

	public String getHabilidade() {
		return habilidade;
	}

	public String getRecurso() {
		return recurso;
	}
	
	
}
