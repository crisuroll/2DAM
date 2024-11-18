package main;

class Hilo implements Runnable {	
	private final Contador c;
	int numHilo;
	int miParte;
	int miCuenta;
	
	public Hilo(int numHilo, int miParte, Contador c) {
		this.numHilo = numHilo;
		this.miParte = miParte;
		this.c = c;
	}
	
	public int getMiCuenta() {
		return this.miCuenta;
	}
	
	@Override
	public void run() {
		System.out.println("Hilo " + this.numHilo + " comienza a contar.");
		for (int i = 0; i < miParte; i++) {
			this.c.incrementa();
			this.miCuenta++;
		}
		System.out.println("Hilo " + this.numHilo + " ha terminado. Cuenta: " + getMiCuenta());
	}
}