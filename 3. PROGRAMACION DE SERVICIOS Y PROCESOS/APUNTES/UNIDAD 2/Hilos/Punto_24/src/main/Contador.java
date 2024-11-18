package main;

class Contador {
	private int cuenta = 0;
	
	public int getCuenta() {
		return this.cuenta;
	}
	
	public int incrementa() {
		this.cuenta++;
		return cuenta;
	}
}