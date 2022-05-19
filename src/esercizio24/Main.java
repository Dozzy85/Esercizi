package esercizio24;

public class Main {

	public static void main(String[] args) {
		
		Coda coda=new Coda();
		
		coda.aggiungiCoda(2);
		coda.aggiungiCoda(3);
		coda.aggiungiCoda(4);
		
		coda.stampaCoda();
		
		coda.rimuoviCoda();
		coda.stampaCoda();
		
	}

}
