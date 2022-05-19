package esercizio18;

public abstract class Personale {

	public String nome;
	public String indirizzo;
	public String numeroTelefono;

	public Personale(String nome, String indirizzo, String numeroTelefono) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.numeroTelefono = numeroTelefono;
	}

	public String getNome() {
		return nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public String dettagliPersonale() {
		String dett="Nome="+this.nome+" Indirizzo="+this.indirizzo+" Numero Telefono="+this.numeroTelefono;
		return dett;
	}

}
