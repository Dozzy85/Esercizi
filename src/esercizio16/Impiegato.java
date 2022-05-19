package esercizio16;

public class Impiegato {

	private String nome;
	private String cognome;
	private double salario;

	public Impiegato(String nome, String cognome, double salario) {
		this.nome = nome;
		this.cognome = cognome;
		this.salario = salario;
	}
	
	public String toString() {
		String dettagli="Impiegato "+"Nome[Nome="+this.nome+" Cognome="+this.cognome+" Salario="+this.salario+"]";
		return dettagli;
	}
	
	public double aumetnaSalario(double percentuale) {
		this.salario=this.salario+((this.salario*percentuale)/100);
		return this.salario;
	}

}
