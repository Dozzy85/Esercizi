package esercizio29;

import java.util.ArrayList;

public class ArrayDinamico {

	private ArrayList<String> array;

	public ArrayDinamico() {
		array = new ArrayList<>();
	}

	public void aggiungi(String testo) {
		array.add(testo);
	}

	public void rimuovi(String testo) {
		array.remove(testo);
	}
	
	public void stampa() {
		System.out.println(this.array);
	}

}
