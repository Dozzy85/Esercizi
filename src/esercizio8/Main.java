package esercizio8;

/*Creare classe Cerchio ... Diametro, calcolare perimetro ed area
  Stampare attributi di area e perimetro*/

public class Main {

	public static void main(String[] args) {
		
		Figura cerchio=new Cerchio(5);
		
		System.out.println("Area del Cerchio="+cerchio.calcoloArea());
		System.out.println("Perimetro del Cerchio="+cerchio.calcoloPerimetro());

	}

}
