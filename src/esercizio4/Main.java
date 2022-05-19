package esercizio4;

/*Una classe Libro con degli attributi autore, titolo, copie; un metodo che ci restituisce il numero di copie disponibili
   Se volessimo stampare i dettagli del libro?
   Se volessimo generare un altra classe (una sottoclasse) che usa la classe libro?*/

public class Main {

	public static void main(String[] args) {
		
		Libro libro=new Libro("Paolo", "Il signore degli anelli", 3);
		System.out.println("Numero copie="+libro.getNumCopie());
		System.out.println(libro.dettagli());
		
		LibroHorror librohorror=new LibroHorror("puffo", "piccoli brividi", 10, "Horror");
		System.out.println("Numero copie="+librohorror.getNumCopie());
		System.out.println(librohorror.dettagli());

	}

}
