import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue<String> q1 = new LinkedList<>();
		Queue<String> q2 = new LinkedList<>();
		
		q1.add("Negro");
		q1.add("Rojo");
		q1.add("Rojo");
		q1.add("Blanco");
		
		q2.add("Negro");
		q2.add("Naranja");
		q2.add("Rojo");
		q2.add("Rojo");
		
		System.out.println("Primera queue: " + q1);
		System.out.println("Primera queue: " + q2);
		
		for (int i = 1; i <= q2.size(); i++) {
			if (q2.contains(q1.element())) {
				System.out.println("Sí");
				q1.poll();
			} else {
				System.out.println("No");
			}
		}

		

	}

}
