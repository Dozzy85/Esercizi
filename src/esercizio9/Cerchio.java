package esercizio9;

import java.math.*;

public class Cerchio implements Figura {

	private double raggio;

	public Cerchio(double unRaggio) {
		this.raggio = unRaggio;
	}

	@Override
	public double calcoloAra() {
		return (this.raggio * this.raggio) * Math.PI;
	}

}
