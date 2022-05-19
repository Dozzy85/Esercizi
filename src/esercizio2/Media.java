package esercizio2;

import java.util.*;

public class Media {

	private int[] array;

	public void inserisciArray() {
		Scanner in = new Scanner(System.in);
		System.out.println("Quanti valori vuoi inserire?");
		int dim = in.nextInt();
		array=new int[dim];
		System.out.println("Inserisci valori array");
		for (int i = 0; i < dim; i++) {
			array[i] = in.nextInt();
		}

	}

	public double media() {
		int somma=0;
		for (int i = 0; i < array.length; i++) {
			somma=somma+array[i];
		}
		return somma/array.length;
	}

}
