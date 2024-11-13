package main;


public class AdivinarNumero {
	private final static int NUM_HILOS_CONCURSANTES = 4;

	public static void main(String[] args) {
		NumeroOculto numOculto = new NumeroOculto();
		Thread[] concursantes = new Thread[NUM_HILOS_CONCURSANTES];
		for (int i = 0; i < NUM_HILOS_CONCURSANTES; i++) {
			Thread concursante = new Thread(new HiloConcursante(numOculto, "h" + (i+1)));
			concursantes[i] = concursante;
		}
		
		for (Thread concursante : concursantes) {
			concursante.start();
		}
		
		for (Thread concursante : concursantes) {
			try {
				concursante.join();
			} catch (InterruptedException ex) {
				
			}
		}
	}
}

