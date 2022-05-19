package esercizio17;

/*Modellare queste classi: autocarri e autoveicoli, gli autocarri: capacità max di carico 
 * mentre autoveicoli: n porte, in comunue hanno: targa, modello e n posti*/

public class Main {

	public static void main(String[] arg) {
		
		Autocarri carro=new Autocarri("ahaha", "Ford", 4, 50);
		System.out.println("Autocarro: "+carro.toString());
		
		Autoveicoli auto=new Autoveicoli("gjgjg", "Civic", 3, 4);
		System.out.println("Autoveicolo: "+auto.toString());
	}

}
