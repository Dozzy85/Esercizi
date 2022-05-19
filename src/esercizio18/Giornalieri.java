package esercizio18;

public class Giornalieri extends Dipendenti {

	private int numGiornate;

	public Giornalieri(String nome, String indirizzo, String numeroTelefono, String codFiscale, double retribuzione,
			int numGiornate) {
		super(nome, indirizzo, numeroTelefono, codFiscale, retribuzione);
		this.numGiornate = numGiornate;
	}

	public double calcolaPaga() {
		double stipendio = this.numGiornate * getRetribuzione();
		return stipendio;
	}

	@Override
	public String dettagliPersonale() {
		return super.dettagliPersonale() + " Numero giornate=" + this.numGiornate + " Stipendio Totale="
				+ calcolaPaga();
	}

}
