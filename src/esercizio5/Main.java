package esercizio5;

/*Istanziare una classe motorino, che abbia attributi: colore velocità e tipo. Implementare un metodo che restituisca la velocità.
  Implementare una seconda classe, MotorinoImmatricolato che estende gli attributi dell'altra classe.*/
public class Main {

	public static void main(String[] args) {
		
		MotorinoImmatricolato m=new MotorinoImmatricolato("Rosso", 10, "Scooter");
		System.out.println("La velocità è: "+m.getVelocità());

	}

}
