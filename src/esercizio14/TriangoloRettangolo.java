package esercizio14;

public class TriangoloRettangolo extends Triangolo {

	public TriangoloRettangolo(double base, double altezza) {
		super(base, altezza);
	}

	public double calcoloArea() {

		double area = (getAltezza() * getBase()) / 2;
		return area;

	}

}
