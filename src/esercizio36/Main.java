package esercizio36;

/*Scrivere un programma con:
   classe impiegato con nome,cognome,salario, con: 
   metodo dettagli che fornisce tutti i dettagli dell'impiegato in una stringa
  metodo AumentaSalario che aumenta il salario in base ad una percentuale
-per dichiarare delle soglie per verificare chi prende di meno e chi prende di più? (con if)*/

public class Main {

	public static void main(String[] args) {
		Impiegato impiegato1 = new Impiegato("Paolo", "Rossi", 1000);
		Impiegato impiegato2 = new Impiegato("Carlo", "Verdi", 900);

		System.out.println(impiegato1.stampaDettagli());
		System.out.println(impiegato2.stampaDettagli());

		impiegato1.aumentaSalario(10);
		impiegato2.aumentaSalario(10);

		System.out.println(impiegato1.stampaDettagli());
		System.out.println(impiegato2.stampaDettagli());

	}

}
