package Esercizio7;

/*Creare una classe Motore con attributi: cilindrata cavalli cilindri
  Metodi: uno che dice se Diesel o Benzina, un altro ritorna il numero massimo di giri, ed un ultimo che calcola la potenza motore
  Implementare altra classe che MotoreABenzina che estende Motore.*/

public class Main {

	public static void main(String[] args) {
		
		MotoreABenzina m=new MotoreABenzina(1600, 60, 4, "Benzina");
		
		System.out.println("Tipo: "+m.getTipo());

	}

}
