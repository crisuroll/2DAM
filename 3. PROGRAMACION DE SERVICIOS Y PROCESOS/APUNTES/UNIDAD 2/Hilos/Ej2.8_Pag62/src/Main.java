
public class Main {
	private final static int num_libros = 6;
	private final static int num_estudiantes = 4;
	public static void main(String[] args) {
		Libro[] libros = new Libro[num_libros];
		Thread[] estudiantes = new Thread[num_estudiantes];
		
		for (int i = 0; i < num_libros; i++) {
			libros[i] = new Libro("Libro " + (i+1));
		}
		
		for (int i = 0; i < num_estudiantes; i++) {
			Thread th = new Thread(new Estudiante(libros, "" + (i+1)));
			estudiantes[i] = th;
		}		
		
		for (Thread th : estudiantes) {
			th.start();
		}
		
		/*for (Thread th : estudiantes) {
			try {
				th.join();
			} catch (InterruptedException e) {
				
			}	
		}*/
		
	}
	
}
