package esercizio17;

public abstract class Veicoli {

	private String targa;
	private String modello;
	private int nposti;

	public Veicoli(String targa, String modello, int nposti) {
		this.targa = targa;
		this.modello = modello;
		this.nposti = nposti;
	}

	public String getTarga() {
		return targa;
	}

	public String getModello() {
		return modello;
	}

	public int getNposti() {
		return nposti;
	}

	@Override
	public String toString() {
		String dettagli="Targa="+getTarga()+" Modello="+getModello()+" Numero Posti="+getNposti();
		return dettagli;
	}

}
