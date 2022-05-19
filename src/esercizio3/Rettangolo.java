package esercizio3;

public class Rettangolo implements Figura {

	private double base;
	private double altezza;

	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public double calcoloArea() {
		double area=this.base*this.altezza;
		return area;
	}

}
