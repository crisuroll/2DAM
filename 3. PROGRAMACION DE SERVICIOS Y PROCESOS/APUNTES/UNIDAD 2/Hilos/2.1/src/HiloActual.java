
public class HiloActual {

	public static void main(String[] args) {
		
		Thread t1 = Thread.currentThread();
		
		System.out.println("Prioridad: " + t1.getPriority());
		System.out.println("Nombre: " + t1.getName());
		System.out.println("ID: " + t1.getId());
		System.out.println("Estado: " + t1.getState());
		

	}

}
