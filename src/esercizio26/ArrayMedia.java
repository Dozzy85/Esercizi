package esercizio26;

public class ArrayMedia {

	public double mediaAritmeica(double[] mediaAritArr) {
		double somma=0;
		double media;
		for(int i=0;i<mediaAritArr.length;i++) {
			somma=somma+mediaAritArr[i];
		}
		media=somma/mediaAritArr.length;
		return media;
	}

	public double mediaPonderata(double[] valori, double[] pesi) {
		double somma=0;
		double moltiplicazione;
		double media;
		for(int i=0;i<valori.length;i++) {
			moltiplicazione=valori[i]*pesi[i];
			somma=moltiplicazione+somma;
		}
		double sommaPesi=0;
		for(int j=0;j<pesi.length;j++) {
			sommaPesi=sommaPesi+pesi[j];
		}
		media=somma/sommaPesi;
		return media;
	}

}
