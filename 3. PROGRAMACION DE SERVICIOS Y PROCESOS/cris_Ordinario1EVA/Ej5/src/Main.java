
public class Main {

	public static void main(String[] args) {
		Tenedor[] tenedores = new Tenedor[5];
		for (int i = 0; i < tenedores.length; i++) {
			tenedores[i] = new Tenedor(i);
		}
		
		Filosofo[] filosofos = new Filosofo[5];
		Thread[] hilos = new Thread[5];
		for (int i = 0; i < filosofos.length; i++) {
			Tenedor tenedorIzquierdo = tenedores[i];
			Tenedor tenedorDerecho = tenedores[(i+1) % tenedores.length];
			filosofos[i] = new Filosofo(i, tenedorIzquierdo, tenedorDerecho);
			hilos[i] = new Thread(filosofos[i], "Filosofo " + i);
			hilos[i].start();
		}

	}

}
