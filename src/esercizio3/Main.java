package esercizio3;

/*Istanziare una classe Rettangolo con due attributi base ed altezza e definire la superfice (creare cioè un metodo per ottenerla)
   Creare una classe Figura, astrazione di elementi geometrici.*/

public class Main {

	public static void main(String[] args) {
		
		Figura rettangolo=new Rettangolo(10, 10);
		System.out.println("L'area del rettangolo è: "+rettangolo.calcoloArea());
	}

}
