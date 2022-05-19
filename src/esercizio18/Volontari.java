package esercizio18;

public class Volontari extends Personale {

	private final int retribuzione = 0;

	public Volontari(String nome, String indirizzo, String numeroTelefono) {
		super(nome, indirizzo, numeroTelefono);
	}

	@Override
	public String dettagliPersonale() {
		return super.dettagliPersonale() + " Retribuzione=" + this.retribuzione;
	}

}
