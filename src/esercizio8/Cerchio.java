package esercizio8;

import java.math.*;

public class Cerchio implements Figura {

	private int diametro;

	public Cerchio(int diametro) {
		this.diametro = diametro;
	}

	@Override
	public double calcoloArea() {
		double raggio = (this.diametro / 2);
		double area = (raggio * raggio) * Math.PI;
		return area;
	}

	@Override
	public double calcoloPerimetro() {
		double perimetro = this.diametro * Math.PI;
		return perimetro;
	}

}
