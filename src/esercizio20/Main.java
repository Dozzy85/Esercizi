package esercizio20;

/*Realizzare Classe forma geometrica e classe triangolo per avere perimetro e superficie*/
public class Main {

	public static void main(String[] args) {

		Triangolo triangolo = new Triangolo(10, 10);
		System.out.println("Area Triangolo=" + triangolo.calcoloArea());
		System.out.println("Perimetro Triangolo=" + triangolo.calcoloPerimetro());

	}

}
