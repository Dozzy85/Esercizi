package esercizio17;

public class Autocarri extends Veicoli {

	private double capacitaCarico;

	public Autocarri(String targa, String modello, int nposti, double capCarico) {
		super(targa, modello, nposti);
		this.capacitaCarico = capCarico;
	}

	@Override
	public String toString() {
		String dettagli = "Targa=" + getTarga() + " Modello=" + getModello() + " Numero Posti=" + getNposti()
				+ " Capacità di carico=" + this.capacitaCarico;
		return dettagli;
	}
	
	
	
	

}
