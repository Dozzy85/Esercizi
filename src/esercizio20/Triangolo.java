package esercizio20;

public class Triangolo implements FormaGeometrica{

	private double base;
	private double altezza;

	public Triangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public double calcoloArea() {
		double area=(this.base*this.altezza)/2;
		return area;
	}

	@Override
	public double calcoloPerimetro() {
		double perimetro=this.altezza*this.base;
		return perimetro;
	}
	
	

}
