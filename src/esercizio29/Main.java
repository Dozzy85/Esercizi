package esercizio29;

/*creazione array dinamico con inserimento e cancellazione*/

public class Main {

	public static void main(String[] args) {
		
		ArrayDinamico array=new ArrayDinamico();
		
		array.aggiungi("Andrea");
		array.aggiungi("Domenico");
		array.aggiungi("Maria");
		array.stampa();
		array.rimuovi("Domenico");
		array.stampa();

	}

}
