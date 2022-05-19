package esercizio17;

public class Autoveicoli extends Veicoli {

	private int nporte;

	public Autoveicoli(String targa, String modello, int nposti, int nporte) {
		super(targa, modello, nposti);
		this.nporte = nporte;
	}

	@Override
	public String toString() {
		String dettagli = "Targa=" + getTarga() + " Modello=" + getModello() + " Numero Posti=" + getNposti()
				+ "Numero Porte="+this.nporte;
		return dettagli;
	}

}
