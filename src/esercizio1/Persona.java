package esercizio1;

public class Persona {

	private String cognome;
	private String nome;
	private int eta;

	public Persona(String cognome, String nome, int eta) {
		super();
		this.cognome = cognome;
		this.nome = nome;
		this.eta = eta;
	}

	public String getCognome() {
		return cognome;
	}

	public String getNome() {
		return nome;
	}

	public int getEta() {
		return eta;
	}

	@Override
	public String toString() {
		return "Persona: cognome=" + cognome + ", nome=" + nome + ", eta=" + eta;
	}

}
