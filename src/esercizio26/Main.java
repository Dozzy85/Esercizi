package esercizio26;

/*implementare il metodo mediaPonderata, che prende in input due array, uno contentente i valori, uno contenente i rispettivi pesi*/

public class Main {

	public static void main(String[] args) {

		ArrayMedia am = new ArrayMedia();

		// calcolo della media aritmetica
		double[] mediaAritArr = { 1, 2, 2, 4, 5, 3, 3, 3 };
		double mediaArit = am.mediaAritmeica(mediaAritArr);
		System.out.println("media aritmetica: " + mediaArit);

		// calcolo della media ponederata
		double[] valori = { 7, 8, 9, 10, 11, 12, 13, 14 };
		double[] pesi = { 8, 12, 15, 50, 100, 10, 9, 6 };
		double mediaPonderata = am.mediaPonderata(valori, pesi);
		System.out.println("media ponderata: " + mediaPonderata);

	}

}
