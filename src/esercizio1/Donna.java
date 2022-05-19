package esercizio1;

public class Donna extends Persona {

	private String sesso;

	public Donna(String cognome, String nome, int eta, String sesso) {
		super(cognome, nome, eta);
		this.sesso = sesso;
	}

	@Override
	public String toString() {
		return super.toString()+" Sesso="+this.sesso;
	}

	

}
