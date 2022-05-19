package esercizio19;

public class Main {

	public static void main(String[] arg) {
		
		ContoLoggato conto=new ContoLoggato(1000);
		conto.deposita(100);
		conto.preleva(50);
		System.out.println("Saldo disponibile="+conto.getSaldo());

	}

}
