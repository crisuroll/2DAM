import java.util.ArrayList;
import java.util.Random;

class Estudiante implements Runnable {
    private final Libro[] libros;
    String id;
    static Random r = new Random();

    public Estudiante(Libro[] libros, String id) {
        this.libros = libros;
        this.id = id;
    }
    
    public static boolean gestorLibros(Libro l1, Libro l2, String id) {
    	Libro menor;
    	Libro mayor;
    	if (l1.getTitulo().compareTo(l2.getTitulo())<0) {
    		menor = l1;
    		mayor = l2;
    	} else {
    		menor = l2;
    		mayor = l1;
    	}
    	
    	boolean result = false;
    	synchronized (menor) {
    		//System.out.println("El estudiante " + id + " ha cogido el libro " + l1.getTitulo());
    		synchronized(mayor) {
    			//System.out.println("El estudiante " + id + " ha cogido el libro " + l2.getTitulo());
    			int pausa = r.nextInt(400);
    			try {
    				System.out.println("El estudiante " + id + " esta leyendo ambos libros." + l1.getTitulo() + " " + l2.getTitulo());
    				Thread.sleep(pausa);
    				result = true;
    			} catch(InterruptedException e) {
    				
    			}
    		}
    	}
    	return result;
    }
    
    @Override
    public void run() {
    	int leidos = 0;
    	ArrayList<Libro> librosLeidos = new ArrayList<>();
    	while (leidos < libros.length) {
    		int r1 = 0;
    		int r2 = 0;
    		Libro l1, l2;
        	do {
        		r1 = r.nextInt(libros.length);
        		r2 = r.nextInt(libros.length);
        		l1 = libros[r1];
        		l2 = libros[r2];
        	} while (r1 == r2 || librosLeidos.contains(l1) || librosLeidos.contains(l2)); 
        	
        	
            if (gestorLibros(l1, l2, id)) {
                if (!librosLeidos.contains(l1)) {
                    librosLeidos.add(l1);
                    leidos++;
                }
                if (!librosLeidos.contains(l2)) {
                    librosLeidos.add(l2);
                    leidos++;
                }
            }
        	System.out.println("El estudiante " + id + " ha dejado los libros.");
        	System.out.println("Libros leidos: " + leidos);
        	int pausa = r.nextInt(200);
        	try {
    			Thread.sleep(pausa);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	}  	
    }
}
