package esercizio9;

public class Reattangolo implements Figura {

	private double base;
	private double altezza;

	public Reattangolo(double unaBase, double unaAltezza) {
		this.base = unaBase;
		this.altezza = unaAltezza;
	}

	@Override
	public double calcoloAra() {
		return this.base * this.altezza;
	}

}
