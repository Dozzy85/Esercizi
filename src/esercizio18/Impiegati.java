package esercizio18;

public class Impiegati extends Dipendenti {

	private double bonus = 0;

	public Impiegati(String nome, String indirizzo, String numeroTelefono, String codFiscale, double retribuzione) {
		super(nome, indirizzo, numeroTelefono, codFiscale, retribuzione);
	}

	public double setBonus(double unBonus) {
		return this.bonus = this.bonus + unBonus;
	}

	public double calcolaPaga() {
		double stipendio = this.bonus + getRetribuzione();
		return stipendio;
	}

	@Override
	public String dettagliPersonale() {
		return super.dettagliPersonale()+" Bonus Totali="+this.bonus+" Stipendio Complessivo="+calcolaPaga();
	}

}
