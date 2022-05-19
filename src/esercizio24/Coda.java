package esercizio24;

import java.util.LinkedList;
import java.util.Queue;

public class Coda {

	private Queue<Integer> array;

	public Coda() {
		array = new LinkedList<>();
	}

	public void aggiungiCoda(int unValore) {
		array.offer(unValore);
	}

	public void rimuoviCoda() {
		array.remove();
	}
	
	public void stampaCoda() {
		System.out.println(array);
	}

}
