package esercizio23;

public class TestArray {

	public double mediaArray(int[] arrayInt) {
		double somma=0;
		double media;
		for(int i=0;i<arrayInt.length;i++) {
			somma=somma+arrayInt[i];
		}
		media=somma/arrayInt.length;
		return media;
	}

}
