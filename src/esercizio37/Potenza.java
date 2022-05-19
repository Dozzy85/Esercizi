package esercizio37;

import java.util.Scanner;
import java.math.*;

public class Potenza {

	private int esponente;
	private int base;

	public Potenza() {
		Scanner in=new Scanner(System.in);
		System.out.println("Inserisci una base=");
		this.base = in.nextInt();
		System.out.println("Inserisci una esponente=");
		this.esponente = in.nextInt();
	}
	
	public void potenza() {
		System.out.println("La potenza è="+Math.pow(this.base, this.esponente));
	}
	
	
	
	

}
