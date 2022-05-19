package esercizio18;

public class Dipendenti extends Personale {

	private String codFiscale;
	private double retribuzione;

	public Dipendenti(String nome, String indirizzo, String numeroTelefono, String codFiscale, double retribuzione) {
		super(nome, indirizzo, numeroTelefono);
		this.codFiscale = codFiscale;
		this.retribuzione = retribuzione;
	}

	public double getRetribuzione() {
		return retribuzione;
	}

	@Override
	public String dettagliPersonale() {
		return super.dettagliPersonale() + " Codice Fiscale=" + this.codFiscale + " Retribuzione Base="
				+ this.retribuzione;
	}

}
