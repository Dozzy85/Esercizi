package esercizio5;

/*Istanziare una classe motorino, che abbia attributi: colore velocit� e tipo. Implementare un metodo che restituisca la velocit�.
  Implementare una seconda classe, MotorinoImmatricolato che estende gli attributi dell'altra classe.*/
public class Main {

	public static void main(String[] args) {
		
		MotorinoImmatricolato m=new MotorinoImmatricolato("Rosso", 10, "Scooter");
		System.out.println("La velocit� �: "+m.getVelocit�());

	}

}
