package main;

class HilosCooperantesNoSincr {
	private final static int NUM_HILOS = 5;
	private final static int TOTAL = 50000;
	
	public static void main(String[] args) {
		Contador cont = new Contador();
		Thread[] hilos = new Thread[NUM_HILOS];
		for (int i = 0; i < NUM_HILOS; i++) {
			//hilos[i] = new Thread(new Hilo((i+1), TOTAL/NUM_HILOS, cont));
			Thread th = new Thread(new Hilo((i+1), TOTAL/NUM_HILOS, cont));
			th.start();
			hilos[i] = th;
		}
		
		/*for (Thread t : hilos) {
			t.start();
		}*/
		
		for (Thread t : hilos) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}