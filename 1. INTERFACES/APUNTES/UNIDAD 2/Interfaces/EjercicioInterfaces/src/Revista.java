
public class Revista implements Prestable {

	private int numero;
	private String editorial;
	
	public Revista(int _numero, String _editorial) {
		this.numero = _numero;
		this.editorial = _editorial;
	}
	
	public void prestar() {
		System.out.println("Se ha prestado el libro.");
	}
	
	public void devolver() {
		System.out.println("Se ha devuelto el libro.");
	}
	
	public boolean estaPrestado() {
		
		return null;
	}
}
