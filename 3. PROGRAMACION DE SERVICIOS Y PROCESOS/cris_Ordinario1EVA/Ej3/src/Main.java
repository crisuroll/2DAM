
public class Main {
	private final static int NUM_HILOS = 8;
	private final static int TOTAL = 100000;
	private final static int PARTE = TOTAL/NUM_HILOS;
	
	public static void main(String[] args) {
		Cuenta c = new Cuenta(1);
		Hilo[] hilos = new Hilo[5];
		for(int i = 0; i < hilos.length; i++) {
			hilos[i] = new Hilo(i, 0, PARTE);
		}
		
		for (Hilo th: hilos) {
			
		}
		
	}

}
