package esercizio37;

import java.math.*;

public class PotenzaArray {

	private int[] base = { 1, 2, 3, 4 };
	private int[] esponente = { 5, 6, 7, 8 };

	public void calcoloPotenza() {
		for (int i = 0; i < base.length; i++) {
			System.out.println("La potenza "+i+"="+Math.pow(base[i], esponente[i]));
		}
	}

}
