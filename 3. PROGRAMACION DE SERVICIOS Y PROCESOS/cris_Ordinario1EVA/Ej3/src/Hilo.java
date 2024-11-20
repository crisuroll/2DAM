
public class Hilo implements Runnable{
	private int id;
	private int miCuenta;
	private int miParte;

	public Hilo(int id, int miCuenta, int miParte) {
		this.id = id;
		this.miCuenta = miCuenta;
		this.miParte = miParte;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < miParte; i++) {
			
		}
		
	}
}
