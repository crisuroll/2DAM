
public class Libro implements Prestable {
	
	private String autor;
	private int isbn;
	
	public Libro(String _autor, int _isbn) {
		this.autor = _autor;
		this.isbn = _isbn;
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
