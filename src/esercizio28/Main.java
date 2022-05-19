package esercizio28;

import java.util.Scanner;

/*prendi dei numeri da tastiera e fai la media (anche con un ciclo)*/
public class Main {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		double valore;
		double somma=0;
		double numeri;

		System.out.println("Quanti valori vuoi inserire?");
		valore=in.nextDouble();
		
		for(int i=0;i<valore;++i){
			System.out.print("Valore=");
			numeri=in.nextDouble();
			somma=somma+numeri;
		}
		double media=somma/valore;
		System.out.println("La media è="+media);
	}

}
