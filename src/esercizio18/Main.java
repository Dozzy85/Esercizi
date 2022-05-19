package esercizio18;

import java.util.ArrayList;
import java.util.List;

/*Si vuole realizzare un insieme di classi per la gestione del personale di un’istituzione. 
 * Ogni persona che lavora nell’istituzione è caratterizzata da un nome, un indirizzo ed un 
 * numero di telefono. Deve essere possibile in qualsiasi momento ottenere una rappresentazione 
 * di un membro del personale sotto forma di stringa o calcolare la sua paga. Nell’istituzione 
 * esistono due tipologie di personale, i volontari e i dipendenti. I dipendenti sono caratterizzati, 
 * oltre che dalle informazioni precedentemente indicate per tutto il personale, anche da un codice fiscale 
 * e da una base di retribuzione. Un volontario percepisce una paga pari a 0, un dipendente percepisce una paga 
 * pari alla base di retribuzione. I dipendenti a loro volta possono essere, giornalieri o impiegati. 
 * I giornalieri sono caratterizzati anche dalle giornate lavorative svolte e la loro paga è calcolata 
 * moltiplicando la loro base di retribuzione per il numero di giorni in cui hanno lavorato. Gli impiegati 
 * sono caratterizzati dal numero di bonus maturati e la loro paga è calcolata sommando i bonus maturati alla 
 * base di retribuzione Infine aggiungiamo che se necessario si può organizzare il personale in gruppi o staffs. 
 * Nella realizzazione delle classi in Java gestire le condizioni di errore lanciando le opportune eccezioni */

public class Main {

	public static void main(String[] args) {
		Volontari volontario = new Volontari("Marco Rossi", "Via cialdi 51 Roma", "3756958434");
		Giornalieri giornaliero = new Giornalieri("Carlo Viola", "Via navona 32 Milano", "0657855", "gfsyhdjedkdik",
				1000, 20);
		Impiegati impiegato = new Impiegati("Valerio Bruno", "Via canosa 45 Napoli", "6982569", "uhshbiuhieu", 1000);

		List<String> staff = new ArrayList<>();
		staff.add(volontario.dettagliPersonale());
		staff.add(giornaliero.dettagliPersonale());
		staff.add(impiegato.dettagliPersonale());

		System.out.println("Volontario: " + volontario.dettagliPersonale());
		System.out.println("Giornaliero: " + giornaliero.dettagliPersonale());
		System.out.println("Impiegato: " + impiegato.dettagliPersonale());

		System.out.println(staff);

	}

}
