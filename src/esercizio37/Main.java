package esercizio37;

/*Creare una classe ElevamentoPotenza che prenda in input dei valori interi con:
metodo che prende in input due numeri interi (base ed esponente) e restituisce il risultato 
-se volessi usare un array per esponente ed un array per base ed un array per risultato?*/

public class Main {

	public static void main(String[] args) {
		
		Potenza pot=new Potenza();
		pot.potenza();
		
		PotenzaArray potArray=new PotenzaArray();
		potArray.calcoloPotenza();

	}

}
