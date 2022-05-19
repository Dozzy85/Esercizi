package esercizio36;

public class Impiegato {

	private String nome;
	private String cognome;
	private double salario;

	public Impiegato(String nome, String cognome, double salario) {
		this.nome = nome;
		this.cognome = cognome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public double getSalario() {
		return salario;
	}
	
	public void aumentaSalario(double unaPercentuale) {
		this.salario=((this.salario*unaPercentuale)/100)+this.salario;
	}

	public String stampaDettagli() {
		String dettagli = "Nome=" + this.nome + " Cognome=" + this.cognome + " Salario=" + this.salario;
		return dettagli;
	}

}
