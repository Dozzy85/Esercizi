package esercizio19;

public class ContoLoggato extends Conto {

	public ContoLoggato(double saldo) throws IllegalArgumentException {
		super(saldo);
	}

	@Override
	public void preleva(double importo) throws IllegalArgumentException {
		super.preleva(importo);
		System.out.println("Prelievo effettuato di=" + importo);
	}

	@Override
	public void deposita(double importo) throws IllegalArgumentException {
		super.deposita(importo);
		System.out.println("Deposito effettuato di=" + importo);
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return super.getSaldo();
	}

}
