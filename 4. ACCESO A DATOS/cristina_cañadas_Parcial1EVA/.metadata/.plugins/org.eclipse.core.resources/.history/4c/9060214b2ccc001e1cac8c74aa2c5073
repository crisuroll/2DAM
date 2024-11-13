import java.util.LinkedList;
import java.util.Queue;

/**
 * Clase Ej01. Escribe un programa en Java que obtenga el mayor elemento en una cola de enteros.
 */
public class Ej01 {

	public static void main(String[] args) {
		Queue<Integer> uwu = new LinkedList<Integer>();
		uwu.add(100);
		uwu.add(23);
		uwu.add(42);
		
		int numQ = 0;
		int max = Integer.MIN_VALUE;
		while(!uwu.isEmpty()) {
			numQ = uwu.element();
			uwu.poll();
			max = Math.max(max, numQ);
		}
		System.out.println(max);
	}

}
