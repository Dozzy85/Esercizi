package esercizio4;

public class LibroHorror extends Libro {

	private String genere;

	public LibroHorror(String autore, String titolo, int numCopie, String genere) {
		super(autore, titolo, numCopie);
		this.genere = genere;
	}

	public String getGenere() {
		return genere;
	}

	@Override
	public int getNumCopie() {
		return super.getNumCopie();
	}

	@Override
	public String dettagli() {
		return super.dettagli() + " Genere=" + getGenere();
	}

}
