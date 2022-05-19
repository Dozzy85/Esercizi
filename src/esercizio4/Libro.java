package esercizio4;

public class Libro {

	private String autore;
	private String titolo;
	private int numCopie;

	public Libro(String autore, String titolo, int numCopie) {
		this.autore = autore;
		this.titolo = titolo;
		this.numCopie = numCopie;
	}
	
	
	public String getAutore() {
		return autore;
	}


	public String getTitolo() {
		return titolo;
	}


	public int getNumCopie() {
		return numCopie;
	}


	public String dettagli() {
		String dett="Libro: "+"Autore="+getAutore()+" Titolo="+getTitolo()+" Numero Copie="+getNumCopie();
		return dett;
	}

}
