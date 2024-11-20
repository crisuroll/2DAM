
public class Filosofo implements Runnable{
	private final Tenedor tenedorIzquierdo;
	private final Tenedor tenedorDerecho;
	private final int id;
	
	public Filosofo(int id, Tenedor tenedorIzquierdo, Tenedor tenedorDerecho) {
		this.id = id;
		this.tenedorIzquierdo = tenedorIzquierdo;
		this.tenedorDerecho = tenedorDerecho;
	}
	
	private void realizarAccion(String accion) throws InterruptedException {
		System.out.println("Filosofo " + id + " " + accion);
		Thread.sleep((int) (Math.random() * 10000));
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				realizarAccion("está pensando");
				synchronized(tenedorIzquierdo) {
					realizarAccion("coge el tenedor " + this.tenedorIzquierdo.getId());
					synchronized(tenedorDerecho) {
						realizarAccion("coge el tenedor " + this.tenedorDerecho.getId());
						realizarAccion("come");
						realizarAccion("suelta el tenedor " + this.tenedorDerecho.getId());
					}
					realizarAccion("suelta el tenedor " + this.tenedorIzquierdo.getId());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
