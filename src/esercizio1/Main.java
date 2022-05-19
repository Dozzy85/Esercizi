package esercizio1;

/*Istanziare una classe con delle variabili, nome, cognome, età. 
   Creare un metodo dettagli che restituisca una stringa con i riferimenti della persona.
   Creare una nuova classe "uomo o donna" che estende gli attributi della classe uomo*/

public class Main {

	public static void main(String[] args) {
		
		Donna giovanna=new Donna("Giovanna", "De Rossi", 30, "Femmina");
		
		System.out.println(giovanna.toString());

	}

}
