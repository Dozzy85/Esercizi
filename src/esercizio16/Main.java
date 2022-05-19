package esercizio16;

/*Classe impiegato che dichiara nome cognome salario con metodo dettagli che restituisce l’informazioni sulla persona, 
   creiamo un metodo aumentasalario che aumenta il salario in base a una certa percentuale*/

public class Main {
	
	public static void main(String[] arg) {
		
		Impiegato imp =new Impiegato("Andrea", "Ferone", 1000);
		System.out.println("Salario="+imp.toString());
		imp.aumetnaSalario(10);
		System.out.println("Salario Con aumento="+imp.toString());
		
	}

}
