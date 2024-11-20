
public class Cuenta {
	private int cuenta;
	
	public Cuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	
	synchronized public void incrementar() {
		cuenta++;
	}
	
	synchronized public int getCuenta() {
		return cuenta;
	}
}
