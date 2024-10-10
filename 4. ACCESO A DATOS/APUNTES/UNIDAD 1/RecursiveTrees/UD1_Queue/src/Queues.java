import java.util.LinkedList;

public class Queues<T> {
	
	// empty, remove retorna y elimina, peek retorna, add inserta elemento(si no hay espacio lanza excepcion)
	// constante MAX_SIZE
	
	private LinkedList<T> cola;
	private final int MAX_SIZE;
	private int elem;
	
	public Queues() {
		this.cola = new LinkedList<T>();
		this.MAX_SIZE = 5;
		this.elem = 0;
	}
	
	public void add(T el) {
		if (this.elem <= MAX_SIZE) {
			this.cola.add(el);
			this.elem++;
		} else {
			throw new IllegalStateException ("ERROR. La cola está llena.");
		}
	}
	
	public T peek() {
		T elem = null;
		if(!empty()) {
			elem = this.cola.getFirst();
		} else {
			throw new IllegalStateException ("ERROR. La cola está vacía.");
		}
		 return elem;
	}
	
	public T remove() {
		T elem = null;
		if(!empty()) {
			elem = this.cola.removeFirst();
		} else {
			throw new IllegalStateException ("ERROR. La cola está vacía.");
		}
		 return elem;
	}
	
	public boolean empty() {
		if (this.cola.isEmpty()) { // EDITAR
			return true;
		} else {
			return false;
		}
	}
	
}
