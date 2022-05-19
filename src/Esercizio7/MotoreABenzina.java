package Esercizio7;

public class MotoreABenzina extends Motore {

	private String tipo;

	public MotoreABenzina(int cilandrata, int cavalli, int clilindri, String unTipo) {
		super(cilandrata, cavalli, clilindri);
		this.tipo = unTipo;
	}

	public String getTipo() {
		return tipo;
	}

}
