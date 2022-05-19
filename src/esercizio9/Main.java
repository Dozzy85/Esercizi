package esercizio9;

import esercizio3.Rettangolo;

/*due forme Cerchio e Rettangolo, da entrambe un metodo per ottenere le superfici.
  Se le superfici sono equivalenti, restituisce uguale, altrimenti quale è maggiore o minore.*/

public class Main {

	public static void main(String[] args) {
		
		Figura cerchio=new Cerchio(5);
		Figura rettangolo=new Reattangolo(5, 5);
		
		System.out.println("Area Cerchio: "+cerchio.calcoloAra());
		System.out.println("Area Rettangolo: "+rettangolo.calcoloAra());

	}

}
