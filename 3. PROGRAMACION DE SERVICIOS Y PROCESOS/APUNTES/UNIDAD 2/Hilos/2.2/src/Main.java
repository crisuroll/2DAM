
public class Main {

	public static void main(String[] args) {
		
		Thread t1 = Thread.currentThread();
		
		System.out.println("MÍNIMA: " + t1.MIN_PRIORITY);
		System.out.println("MÁXIMA: " + t1.MAX_PRIORITY);

	}

}
