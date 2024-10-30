import java.util.ArrayList;

public class ArrayListAsStack <T> {
	
	private ArrayList<T> pila;
	
	public ArrayListAsStack() {
		pila = new ArrayList<T>();
	}
	
	public void push(T el) {
		pila.add(el);
	}
	
	public T pop() {
		T del = null;
		if(pila.isEmpty()) {
			System.out.println("Error. La pila está vacía.");
		} else {
			System.out.println("Eliminando...");
			del = pila.remove(pila.size() - 1);
		}
		
		return del;
	}
	
	public void remove() {
		if (pila.isEmpty()) {
			System.out.println("Error. La pila está vacía.");
		} else {
			pila.remove(a.size()-1);
		}
	}
	
	public T peek() {
		T cima = null;
		if(pila.isEmpty()) {
			System.out.println("Error. La pila está vacía.");
		} else {
			cima = pila.get(pila.size()-1);
			System.out.println("La cima es " + cima);
		}
		return cima;
	}
	
	public boolean empty() {
		if (pila.size() <= 0) {
			return true;
		} else {
			return false;
		}
		
	}


}
